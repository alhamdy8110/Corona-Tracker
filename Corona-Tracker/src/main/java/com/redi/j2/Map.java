package com.redi.j2;

public class Map {

    private Integer id, update, cases, todayCases, deaths, todayDeaths, recovered, todayRecovered,
            active, critical, casesPerOneMillion, deathsPerOneMillion, tests, testsPerOneMillion,
            population, continent, oneCasePerPeople, oneDeathPerPeople, oneTestPerPeople, activePerOneMillion,
            recoveredPerOneMillion, criticalPerOneMillion;
    private String country, iso2, iso3, lat, lang, flag;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUpdate() {
        return update;
    }

    public void setUpdate(Integer update) {
        this.update = update;
    }

    public Integer getCases() {
        return cases;
    }

    public void setCases(Integer cases) {
        this.cases = cases;
    }

    public Integer getTodayCases() {
        return todayCases;
    }

    public void setTodayCases(Integer todayCases) {
        this.todayCases = todayCases;
    }

    public Integer getDeaths() {
        return deaths;
    }

    public void setDeaths(Integer deaths) {
        this.deaths = deaths;
    }

    public Integer getTodayDeaths() {
        return todayDeaths;
    }

    public void setTodayDeaths(Integer todayDeaths) {
        this.todayDeaths = todayDeaths;
    }

    public Integer getRecovered() {
        return recovered;
    }

    public void setRecovered(Integer recovered) {
        this.recovered = recovered;
    }

    public Integer getTodayRecovered() {
        return todayRecovered;
    }

    public void setTodayRecovered(Integer todayRecovered) {
        this.todayRecovered = todayRecovered;
    }

    public Integer getActive() {
        return active;
    }

    public void setActive(Integer active) {
        this.active = active;
    }

    public Integer getCritical() {
        return critical;
    }

    public void setCritical(Integer critical) {
        this.critical = critical;
    }

    public Integer getCasesPerOneMillion() {
        return casesPerOneMillion;
    }

    public void setCasesPerOneMillion(Integer casesPerOneMillion) {
        this.casesPerOneMillion = casesPerOneMillion;
    }

    public Integer getDeathsPerOneMillion() {
        return deathsPerOneMillion;
    }

    public void setDeathsPerOneMillion(Integer deathsPerOneMillion) {
        this.deathsPerOneMillion = deathsPerOneMillion;
    }

    public Integer getTests() {
        return tests;
    }

    public void setTests(Integer tests) {
        this.tests = tests;
    }

    public Integer getTestsPerOneMillion() {
        return testsPerOneMillion;
    }

    public void setTestsPerOneMillion(Integer testsPerOneMillion) {
        this.testsPerOneMillion = testsPerOneMillion;
    }

    public Integer getPopulation() {
        return population;
    }

    public void setPopulation(Integer population) {
        this.population = population;
    }

    public Integer getContinent() {
        return continent;
    }

    public void setContinent(Integer continent) {
        this.continent = continent;
    }

    public Integer getOneCasePerPeople() {
        return oneCasePerPeople;
    }

    public void setOneCasePerPeople(Integer oneCasePerPeople) {
        this.oneCasePerPeople = oneCasePerPeople;
    }

    public Integer getOneDeathPerPeople() {
        return oneDeathPerPeople;
    }

    public void setOneDeathPerPeople(Integer oneDeathPerPeople) {
        this.oneDeathPerPeople = oneDeathPerPeople;
    }

    public Integer getOneTestPerPeople() {
        return oneTestPerPeople;
    }

    public void setOneTestPerPeople(Integer oneTestPerPeople) {
        this.oneTestPerPeople = oneTestPerPeople;
    }

    public Integer getActivePerOneMillion() {
        return activePerOneMillion;
    }

    public void setActivePerOneMillion(Integer activePerOneMillion) {
        this.activePerOneMillion = activePerOneMillion;
    }

    public Integer getRecoveredPerOneMillion() {
        return recoveredPerOneMillion;
    }

    public void setRecoveredPerOneMillion(Integer recoveredPerOneMillion) {
        this.recoveredPerOneMillion = recoveredPerOneMillion;
    }

    public Integer getCriticalPerOneMillion() {
        return criticalPerOneMillion;
    }

    public void setCriticalPerOneMillion(Integer criticalPerOneMillion) {
        this.criticalPerOneMillion = criticalPerOneMillion;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getIso2() {
        return iso2;
    }

    public void setIso2(String iso2) {
        this.iso2 = iso2;
    }

    public String getIso3() {
        return iso3;
    }

    public void setIso3(String iso3) {
        this.iso3 = iso3;
    }

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Map{");
        sb.append("id=").append(id);
        sb.append(", update=").append(update);
        sb.append(", cases=").append(cases);
        sb.append(", todayCases=").append(todayCases);
        sb.append(", deaths=").append(deaths);
        sb.append(", todayDeaths=").append(todayDeaths);
        sb.append(", recovered=").append(recovered);
        sb.append(", todayRecovered=").append(todayRecovered);
        sb.append(", active=").append(active);
        sb.append(", critical=").append(critical);
        sb.append(", casesPerOneMillion=").append(casesPerOneMillion);
        sb.append(", deathsPerOneMillion=").append(deathsPerOneMillion);
        sb.append(", tests=").append(tests);
        sb.append(", testsPerOneMillion=").append(testsPerOneMillion);
        sb.append(", population=").append(population);
        sb.append(", continent=").append(continent);
        sb.append(", oneCasePerPeople=").append(oneCasePerPeople);
        sb.append(", oneDeathPerPeople=").append(oneDeathPerPeople);
        sb.append(", oneTestPerPeople=").append(oneTestPerPeople);
        sb.append(", activePerOneMillion=").append(activePerOneMillion);
        sb.append(", recoveredPerOneMillion=").append(recoveredPerOneMillion);
        sb.append(", criticalPerOneMillion=").append(criticalPerOneMillion);
        sb.append(", country='").append(country).append('\'');
        sb.append(", iso2='").append(iso2).append('\'');
        sb.append(", iso3='").append(iso3).append('\'');
        sb.append(", lat='").append(lat).append('\'');
        sb.append(", lang='").append(lang).append('\'');
        sb.append(", flag='").append(flag).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
