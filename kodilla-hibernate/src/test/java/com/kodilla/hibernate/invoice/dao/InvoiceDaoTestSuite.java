package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.transaction.Transactional;
import java.math.BigDecimal;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {
    @Autowired
    InvoiceDao invoiceDao;
    @Autowired
    ItemDao itemDao;
    @Autowired
    ProductDao productDao;

    @Transactional
    @Test
    public void testInvoiceDaoSave(){
        //Given
        Product littleBike = new Product("Little bike");
        Product scooter = new Product("Scooter");
        Product tricycle = new Product("Tricycle");

        productDao.save(littleBike);
        productDao.save(scooter);
        productDao.save(tricycle);

        Invoice invoice1 = new Invoice("FV20180501");
        Invoice invoice2 = new Invoice("FV20180502");

        Item item1 = new Item(BigDecimal.valueOf(23.15),1);
        Item item2 = new Item(BigDecimal.valueOf(21.99),2);
        Item item3 = new Item(BigDecimal.valueOf(17.55),3);
        Item item4 = new Item(BigDecimal.valueOf(21.99),1);
        Item item5 = new Item(BigDecimal.valueOf(23.15),2);

        littleBike.getItems().add(item1);
        scooter.getItems().add(item2);
        tricycle.getItems().add(item3);
        scooter.getItems().add(item4);
        littleBike.getItems().add(item5);
        item1.setProduct(littleBike);
        item2.setProduct(scooter);
        item3.setProduct(tricycle);
        item4.setProduct(scooter);
        item5.setProduct(littleBike);

        invoice1.getItems().add(item1);
        invoice1.getItems().add(item2);
        invoice1.getItems().add(item3);
        invoice2.getItems().add(item4);
        invoice2.getItems().add(item5);
        item1.setInvoice(invoice1);
        item2.setInvoice(invoice1);
        item3.setInvoice(invoice1);
        item4.setInvoice(invoice2);
        item5.setInvoice(invoice2);

        invoiceDao.save(invoice1);
        invoiceDao.save(invoice2);

        //When
        int size1 = invoice1.getItems().size();
        int size2 = invoice2.getItems().size();

        //Then
        Assert.assertEquals(3, size1);
        Assert.assertEquals(2, size2);
    }
}
