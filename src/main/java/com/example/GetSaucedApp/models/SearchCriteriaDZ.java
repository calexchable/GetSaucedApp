package com.example.GetSaucedApp.models;

public abstract class SearchCriteriaDZ {
    private boolean pagination = false;
    private int pageSize = 25;
    private String sortOrder = "ASC";

    public boolean isPagination() {
        return pagination;
    }

    public void setPagination(boolean pagination) {
        this.pagination = pagination;
    }
    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize (int pageSize) {
        this.pageSize = pageSize;
    }

    public String getSortOrder() {
        return sortOrder;
    }

    public void setSortOrder(String sortOrder) {
        this.sortOrder = sortOrder;
    }
}
