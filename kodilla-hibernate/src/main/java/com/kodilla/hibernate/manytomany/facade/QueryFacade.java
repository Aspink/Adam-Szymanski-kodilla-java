package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public final class QueryFacade {
    @Autowired
    private CompanyDao companyDao;
    @Autowired
    private EmployeeDao employeeDao;

    public List<Employee> findEmployee(final String nameFrag) {
        String name = "%" + nameFrag +"%";
        List<Employee> employeesWithNameFrag = employeeDao.retrieveEmployeeWithGivenLastname(name);
        return employeesWithNameFrag;
    }

    public List<Company> findCompany(final String nameFrag) {
        String name = "%" + nameFrag +"%";
        List<Company> companiesWithNameFrag = companyDao.retrieveCompaniesWithGivenName(name);
        return companiesWithNameFrag;
    }
}
