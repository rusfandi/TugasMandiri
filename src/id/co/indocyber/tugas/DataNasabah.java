/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.co.indocyber.tugas;

/**
 *
 * @author Rusfandi
 */
public class DataNasabah {

    /**
     * @return the kode
     */
    public String getKode() {
        return kode;
    }

    /**
     * @param kode the kode to set
     */
    public void setKode(String kode) {
        this.kode = kode;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * @param gender the gender to set
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * @return the maried
     */
    public Boolean getMaried() {
        return maried;
    }

    /**
     * @param maried the maried to set
     */
    public void setMaried(Boolean maried) {
        this.maried = maried;
    }

    /**
     * @return the age
     */
    public Integer getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(Integer age) {
        this.age = age;
    }

    /**
     * @return the nomorTeleponNasabah
     */
    public String getNomorTeleponNasabah() {
        return nomorTeleponNasabah;
    }

    /**
     * @param nomorTeleponNasabah the nomorTeleponNasabah to set
     */
    public void setNomorTeleponNasabah(String nomorTeleponNasabah) {
        this.nomorTeleponNasabah = nomorTeleponNasabah;
    }

    /**
     * @return the nomorHpNasabah
     */
    public String getNomorHpNasabah() {
        return nomorHpNasabah;
    }

    /**
     * @param nomorHpNasabah the nomorHpNasabah to set
     */
    public void setNomorHpNasabah(String nomorHpNasabah) {
        this.nomorHpNasabah = nomorHpNasabah;
    }

    /**
     * @return the alamatNasabah
     */
    public String getAlamatNasabah() {
        return alamatNasabah;
    }

    /**
     * @param alamatNasabah the alamatNasabah to set
     */
    public void setAlamatNasabah(String alamatNasabah) {
        this.alamatNasabah = alamatNasabah;
    }
    private String kode;
    private String name;
    private String gender;
    private Boolean maried;
    private Integer age;
    private String nomorTeleponNasabah;
    private String nomorHpNasabah;
    private String alamatNasabah;

    public DataNasabah() {
    }

    public DataNasabah(String kode, String name, String gender, Boolean maried, Integer age, String nomorTeleponNasabah, String nomorHpNasabah, String alamatNasabah) {
        this.kode = kode;
        this.name = name;
        this.gender = gender;
        this.maried = maried;
        this.age = age;
        this.nomorTeleponNasabah = nomorTeleponNasabah;
        this.nomorHpNasabah = nomorHpNasabah;
        this.alamatNasabah = alamatNasabah;
    }

    

}
