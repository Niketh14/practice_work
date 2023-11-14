package com.springdatajpa.serviceImpl;

import java.util.List;
import java.util.Optional;

import javax.print.DocFlavor;
import javax.print.DocPrintJob;
import javax.print.PrintService;
import javax.print.ServiceUIFactory;
import javax.print.attribute.Attribute;
import javax.print.attribute.AttributeSet;
import javax.print.attribute.PrintServiceAttribute;
import javax.print.attribute.PrintServiceAttributeSet;
import javax.print.event.PrintServiceAttributeListener;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springdatajpa.entity.Product;
import com.springdatajpa.repository.ProductRepository;

@Service 
public class ProductServiceImpl implements PrintService 
{ private final ProductRepository productRepository; 
@Autowired
 public ProductServiceImpl(ProductRepository productRepository) { this.productRepository = productRepository; }
 public Optional<Product> getProductsBySalesId(Long salesId)
 { return productRepository.findById(salesId); }
@Override
public String getName() {
	// TODO Auto-generated method stub
	return null;
}
@Override
public DocPrintJob createPrintJob() {
	// TODO Auto-generated method stub
	return null;
}
@Override
public void addPrintServiceAttributeListener(PrintServiceAttributeListener listener) {
	// TODO Auto-generated method stub
	
}
@Override
public void removePrintServiceAttributeListener(PrintServiceAttributeListener listener) {
	// TODO Auto-generated method stub
	
}
@Override
public PrintServiceAttributeSet getAttributes() {
	// TODO Auto-generated method stub
	return null;
}
@Override
public <T extends PrintServiceAttribute> T getAttribute(Class<T> category) {
	// TODO Auto-generated method stub
	return null;
}
@Override
public DocFlavor[] getSupportedDocFlavors() {
	// TODO Auto-generated method stub
	return null;
}
@Override
public boolean isDocFlavorSupported(DocFlavor flavor) {
	// TODO Auto-generated method stub
	return false;
}
@Override
public Class<?>[] getSupportedAttributeCategories() {
	// TODO Auto-generated method stub
	return null;
}
@Override
public boolean isAttributeCategorySupported(Class<? extends Attribute> category) {
	// TODO Auto-generated method stub
	return false;
}
@Override
public Object getDefaultAttributeValue(Class<? extends Attribute> category) {
	// TODO Auto-generated method stub
	return null;
}
@Override
public Object getSupportedAttributeValues(Class<? extends Attribute> category, DocFlavor flavor,
		AttributeSet attributes) {
	// TODO Auto-generated method stub
	return null;
}
@Override
public boolean isAttributeValueSupported(Attribute attrval, DocFlavor flavor, AttributeSet attributes) {
	// TODO Auto-generated method stub
	return false;
}
@Override
public AttributeSet getUnsupportedAttributes(DocFlavor flavor, AttributeSet attributes) {
	// TODO Auto-generated method stub
	return null;
}
@Override
public ServiceUIFactory getServiceUIFactory() {
	// TODO Auto-generated method stub
	return null;
} } 
