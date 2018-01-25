package com.mkyong;

import java.io.Serializable;
import java.util.List;
import java.util.Locale;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import org.primefaces.component.datatable.DataTable;
import org.primefaces.context.RequestContext;

/**
 * used for the filtering.
 */
@ManagedBean(name="dtFilterView")
@ViewScoped
public class FilterView implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	  
    private List<Car> cars;
     
    private List<Car> filteredCars;
     
    @ManagedProperty("#{carService}")
    private CarService service;
 
    @PostConstruct
    public void init() {
        cars = service.createCars(10);
    }
     
    
    public void clear(){
    	DataTable dataTable = (DataTable) FacesContext.getCurrentInstance().getViewRoot().findComponent("mainForm:vtDecomDataTable");
    	//dataTable.reset();
    	dataTable.clearInitialState();
    	RequestContext requestContext = RequestContext.getCurrentInstance();
        requestContext.update("mainForm:vtDecomDataTable");
    	//FacesContext.getCurrentInstance().getExternalContext().getSessionMap().remove("mainForm:vtDecomDataTable");
    	
    }
    
    public boolean filterByPrice(Object value, Object filter, Locale locale) {
        String filterText = (filter == null) ? null : filter.toString().trim();
        if(filterText == null||filterText.equals("")) {
            return true;
        }
         
        if(value == null) {
            return false;
        }
         
        return ((Comparable) value).compareTo(Integer.valueOf(filterText)) > 0;
    }
     
    public List<String> getBrands() {
        return service.getBrands();
    }
     
    public List<String> getColors() {
        return service.getColors();
    }
     
    public List<Car> getCars() {
        return cars;
    }
 
    public List<Car> getFilteredCars() {
        return filteredCars;
    }
 
    public void setFilteredCars(List<Car> filteredCars) {
        this.filteredCars = filteredCars;
    }
 
    public void setService(CarService service) {
        this.service = service;
    }
	
}
