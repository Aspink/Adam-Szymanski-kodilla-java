package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.transaction.Transactional;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FacadeTestSuite {
    @Autowired
    QueryFacade facade;
    @Autowired
    CompanyDao companyDao;

    @Transactional
    @Test
    public void testCompanyNameFragmentQueries(){
        //Given
        Employee johnSwackson = new Employee("John", "Swackson");
        Employee stephanieClarckson = new Employee("Stephanie", "Clarckson");
        Employee lindaKovalsky = new Employee("Linda", "Kovalsky");
        Employee jeremyClarckson = new Employee("Jeremy", "Clarckson");

        Company softwareMachine = new Company("Software Machine");
        Company dataMaesters = new Company("Data Maesters");
        Company greyMatter = new Company("Grey Matter");
        Company softballProducts = new Company("Softball Products");

        softwareMachine.getEmployees().add(johnSwackson);
        dataMaesters.getEmployees().add(stephanieClarckson);
        dataMaesters.getEmployees().add(lindaKovalsky);
        greyMatter.getEmployees().add(johnSwackson);
        greyMatter.getEmployees().add(lindaKovalsky);
        softballProducts.getEmployees().add(lindaKovalsky);
        softballProducts.getEmployees().add(jeremyClarckson);
        softballProducts.getEmployees().add(stephanieClarckson);

        johnSwackson.getCompanies().add(softwareMachine);
        johnSwackson.getCompanies().add(greyMatter);
        stephanieClarckson.getCompanies().add(dataMaesters);
        stephanieClarckson.getCompanies().add(softballProducts);
        lindaKovalsky.getCompanies().add(dataMaesters);
        lindaKovalsky.getCompanies().add(greyMatter);
        lindaKovalsky.getCompanies().add(softballProducts);
        jeremyClarckson.getCompanies().add(softballProducts);

        //When
        companyDao.save(softwareMachine);
        companyDao.save(dataMaesters);
        companyDao.save(greyMatter);
        companyDao.save(softballProducts);
        List<Company> companiesWithNameFrag = facade.findCompany("ma");
        System.out.println("\nCompanies with \"ma\" in name:\n");
        for (Company company : companiesWithNameFrag) {
            System.out.println(company.getName());
        }
        System.out.println();

        //Then
        Assert.assertEquals(3, companiesWithNameFrag.size());
    }

    @Transactional
    @Test
    public void testEmployeeNameFragmentQueries(){
        //Given
        Employee johnSwackson = new Employee("John", "Swackson");
        Employee stephanieClarckson = new Employee("Stephanie", "Clarckson");
        Employee lindaKovalsky = new Employee("Linda", "Kovalsky");
        Employee jeremyClarckson = new Employee("Jeremy", "Clarckson");

        Company softwareMachine = new Company("Software Machine");
        Company dataMaesters = new Company("Data Maesters");
        Company greyMatter = new Company("Grey Matter");
        Company softballProducts = new Company("Softball Products");

        softwareMachine.getEmployees().add(johnSwackson);
        dataMaesters.getEmployees().add(stephanieClarckson);
        dataMaesters.getEmployees().add(lindaKovalsky);
        greyMatter.getEmployees().add(johnSwackson);
        greyMatter.getEmployees().add(lindaKovalsky);
        softballProducts.getEmployees().add(lindaKovalsky);
        softballProducts.getEmployees().add(jeremyClarckson);
        softballProducts.getEmployees().add(stephanieClarckson);

        johnSwackson.getCompanies().add(softwareMachine);
        johnSwackson.getCompanies().add(greyMatter);
        stephanieClarckson.getCompanies().add(dataMaesters);
        stephanieClarckson.getCompanies().add(softballProducts);
        lindaKovalsky.getCompanies().add(dataMaesters);
        lindaKovalsky.getCompanies().add(greyMatter);
        lindaKovalsky.getCompanies().add(softballProducts);
        jeremyClarckson.getCompanies().add(softballProducts);

        //When
        companyDao.save(softwareMachine);
        companyDao.save(dataMaesters);
        companyDao.save(greyMatter);
        companyDao.save(softballProducts);
        List<Employee> employeesWithNameFrag = facade.findEmployee("kso");
        System.out.println("\nEmployees with \"kso\" in lastname:\n");
        for (Employee employee : employeesWithNameFrag) {
            System.out.println(employee.getFirstname() + " " + employee.getLastname());
        }
        System.out.println();


        //Then
        Assert.assertEquals(3, employeesWithNameFrag.size());
    }

    @Transactional
    @Test
    public void testCompanyNoResults(){
        //Given
        Employee johnSwackson = new Employee("John", "Swackson");
        Employee stephanieClarckson = new Employee("Stephanie", "Clarckson");
        Employee lindaKovalsky = new Employee("Linda", "Kovalsky");
        Employee jeremyClarckson = new Employee("Jeremy", "Clarckson");

        Company softwareMachine = new Company("Software Machine");
        Company dataMaesters = new Company("Data Maesters");
        Company greyMatter = new Company("Grey Matter");
        Company softballProducts = new Company("Softball Products");

        softwareMachine.getEmployees().add(johnSwackson);
        dataMaesters.getEmployees().add(stephanieClarckson);
        dataMaesters.getEmployees().add(lindaKovalsky);
        greyMatter.getEmployees().add(johnSwackson);
        greyMatter.getEmployees().add(lindaKovalsky);
        softballProducts.getEmployees().add(lindaKovalsky);
        softballProducts.getEmployees().add(jeremyClarckson);
        softballProducts.getEmployees().add(stephanieClarckson);

        johnSwackson.getCompanies().add(softwareMachine);
        johnSwackson.getCompanies().add(greyMatter);
        stephanieClarckson.getCompanies().add(dataMaesters);
        stephanieClarckson.getCompanies().add(softballProducts);
        lindaKovalsky.getCompanies().add(dataMaesters);
        lindaKovalsky.getCompanies().add(greyMatter);
        lindaKovalsky.getCompanies().add(softballProducts);
        jeremyClarckson.getCompanies().add(softballProducts);

        //When
        companyDao.save(softwareMachine);
        companyDao.save(dataMaesters);
        companyDao.save(greyMatter);
        companyDao.save(softballProducts);
        List<Company> noCompaniesWithNameFrag = facade.findCompany("aka");

        //Then
        Assert.assertEquals(0, noCompaniesWithNameFrag.size());
    }

    @Transactional
    @Test
    public void testEmployeeNoResults(){
        //Given
        Employee johnSwackson = new Employee("John", "Swackson");
        Employee stephanieClarckson = new Employee("Stephanie", "Clarckson");
        Employee lindaKovalsky = new Employee("Linda", "Kovalsky");
        Employee jeremyClarckson = new Employee("Jeremy", "Clarckson");

        Company softwareMachine = new Company("Software Machine");
        Company dataMaesters = new Company("Data Maesters");
        Company greyMatter = new Company("Grey Matter");
        Company softballProducts = new Company("Softball Products");

        softwareMachine.getEmployees().add(johnSwackson);
        dataMaesters.getEmployees().add(stephanieClarckson);
        dataMaesters.getEmployees().add(lindaKovalsky);
        greyMatter.getEmployees().add(johnSwackson);
        greyMatter.getEmployees().add(lindaKovalsky);
        softballProducts.getEmployees().add(lindaKovalsky);
        softballProducts.getEmployees().add(jeremyClarckson);
        softballProducts.getEmployees().add(stephanieClarckson);

        johnSwackson.getCompanies().add(softwareMachine);
        johnSwackson.getCompanies().add(greyMatter);
        stephanieClarckson.getCompanies().add(dataMaesters);
        stephanieClarckson.getCompanies().add(softballProducts);
        lindaKovalsky.getCompanies().add(dataMaesters);
        lindaKovalsky.getCompanies().add(greyMatter);
        lindaKovalsky.getCompanies().add(softballProducts);
        jeremyClarckson.getCompanies().add(softballProducts);

        //When
        companyDao.save(softwareMachine);
        companyDao.save(dataMaesters);
        companyDao.save(greyMatter);
        companyDao.save(softballProducts);
        List<Employee> employeesWithNameFrag = facade.findEmployee("bor");

        //Then
        Assert.assertEquals(0, employeesWithNameFrag.size());

    }
}
