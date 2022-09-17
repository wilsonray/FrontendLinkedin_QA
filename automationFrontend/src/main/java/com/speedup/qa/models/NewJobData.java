package com.speedup.qa.models;

public class NewJobData {
    private String jobTitle;
    private String employmentType;
    private String companyName;
    private String location;
    private String startMonth;
    private String startYear;
    private String industry;
    private String profileHeadline;

    public NewJobData(String jobTitle, String employmentType, String companyName, String location, String startMonth, String startYear, String industry, String profileHeadline) {
        this.jobTitle = jobTitle;
        this.employmentType = employmentType;
        this.companyName = companyName;
        this.location = location;
        this.startMonth = startMonth;
        this.startYear = startYear;
        this.industry = industry;
        this.profileHeadline = profileHeadline;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public String getEmploymentType() {
        return employmentType;
    }

    public String getCompanyName() {
        return companyName;
    }

    public String getLocation() {
        return location;
    }

    public String getStartMonth() {
        return startMonth;
    }

    public String getStartYear() {
        return startYear;
    }

    public String getIndustry() {
        return industry;
    }

    public String getProfileHeadline() {
        return profileHeadline;
    }
}
