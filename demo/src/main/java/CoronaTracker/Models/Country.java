package CoronaTracker.Models;

import javax.persistence.*;

@Entity
public class Country {


    public class Map {


        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private long id;

        @Column
        private long update, cases, todayCases, deaths, todayDeaths, recovered, todayRecovered,
                active, critical, casesPerOneMillion, deathsPerOneMillion, tests, testsPerOneMillion,
                population, continent, oneCasePerPeople, oneDeathPerPeople, oneTestPerPeople, activePerOneMillion,
                recoveredPerOneMillion, criticalPerOneMillion;

        @Column
        private String country, iso2, iso3, lat, lang, flag;

        public long getId() {
            return id;
        }

        public void setId(long id) {
            this.id = id;
        }

        public long getUpdate() {
            return update;
        }

        public void setUpdate(long update) {
            this.update = update;
        }

        public long getCases() {
            return cases;
        }

        public void setCases(long cases) {
            this.cases = cases;
        }

        public long getTodayCases() {
            return todayCases;
        }

        public void setTodayCases(long todayCases) {
            this.todayCases = todayCases;
        }

        public long getDeaths() {
            return deaths;
        }

        public void setDeaths(long deaths) {
            this.deaths = deaths;
        }

        public long getTodayDeaths() {
            return todayDeaths;
        }

        public void setTodayDeaths(long todayDeaths) {
            this.todayDeaths = todayDeaths;
        }

        public long getRecovered() {
            return recovered;
        }

        public void setRecovered(long recovered) {
            this.recovered = recovered;
        }

        public long getTodayRecovered() {
            return todayRecovered;
        }

        public void setTodayRecovered(long todayRecovered) {
            this.todayRecovered = todayRecovered;
        }

        public long getActive() {
            return active;
        }

        public void setActive(long active) {
            this.active = active;
        }

        public long getCritical() {
            return critical;
        }

        public void setCritical(long critical) {
            this.critical = critical;
        }

        public long getCasesPerOneMillion() {
            return casesPerOneMillion;
        }

        public void setCasesPerOneMillion(long casesPerOneMillion) {
            this.casesPerOneMillion = casesPerOneMillion;
        }

        public long getDeathsPerOneMillion() {
            return deathsPerOneMillion;
        }

        public void setDeathsPerOneMillion(long deathsPerOneMillion) {
            this.deathsPerOneMillion = deathsPerOneMillion;
        }

        public long getTests() {
            return tests;
        }

        public void setTests(long tests) {
            this.tests = tests;
        }

        public long getTestsPerOneMillion() {
            return testsPerOneMillion;
        }

        public void setTestsPerOneMillion(long testsPerOneMillion) {
            this.testsPerOneMillion = testsPerOneMillion;
        }

        public long getPopulation() {
            return population;
        }

        public void setPopulation(long population) {
            this.population = population;
        }

        public long getContinent() {
            return continent;
        }

        public void setContinent(long continent) {
            this.continent = continent;
        }

        public long getOneCasePerPeople() {
            return oneCasePerPeople;
        }

        public void setOneCasePerPeople(long oneCasePerPeople) {
            this.oneCasePerPeople = oneCasePerPeople;
        }

        public long getOneDeathPerPeople() {
            return oneDeathPerPeople;
        }

        public void setOneDeathPerPeople(long oneDeathPerPeople) {
            this.oneDeathPerPeople = oneDeathPerPeople;
        }

        public long getOneTestPerPeople() {
            return oneTestPerPeople;
        }

        public void setOneTestPerPeople(long oneTestPerPeople) {
            this.oneTestPerPeople = oneTestPerPeople;
        }

        public long getActivePerOneMillion() {
            return activePerOneMillion;
        }

        public void setActivePerOneMillion(long activePerOneMillion) {
            this.activePerOneMillion = activePerOneMillion;
        }

        public long getRecoveredPerOneMillion() {
            return recoveredPerOneMillion;
        }

        public void setRecoveredPerOneMillion(long recoveredPerOneMillion) {
            this.recoveredPerOneMillion = recoveredPerOneMillion;
        }

        public long getCriticalPerOneMillion() {
            return criticalPerOneMillion;
        }

        public void setCriticalPerOneMillion(long criticalPerOneMillion) {
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
}
