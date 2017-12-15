package com.fyakutrestfulnotes.demo.Notlar;

public class Notess {
    /**
     * web service
     * farklı uygulamalar, farklı frameworklerin birbiri ile çalışmasını sağlar.(interoperating)
     * Farklı prgramlama dili de olsa etkilenmez.
     *
     * Data alınıp verilebilir.Dışarıya public bir hizmet açılabilri
     * hava durumu,ip location webservice
     * Birlikte çalışma,veri değiştirme işlemleri webservice ile sağlanır.
     *
     *Client ile server arasında web service ile data alışverişi sağlanır.
     *
     *müşteriye sağlanan web hizmetleri;
     * müşteri web servisler yardımıyla kendi bilgilerini parametre olarak girebilir
     * transcation ,order bilgilerini görebilir.
     *
     *Java da iki tip webservice vardır.
     * JAX-RS
     * JAX-WS
     *
     *JAX-RS ve JAX-WS java EE'nın bir parçası/bölümüdür
     *
     *
     * ##JAX-RS
     * Java API for RESTful web service anlamına gelmektedir.https://jcp.org erişim yapılabilir
     *HTTP protokolleri ile RESTful kaynaklarına erişen bir mimari
     *
     *
     * JAX_RS impletasyonları;
     * jersey
     * RESTesay
     * Apache CFX
     * Reste
     *
     *
     * REST 2000 yılında Roy fielding tarafından bir tez sonucu ortaya cıkmıştır.
     * Anlamı:REpresatatıon State Transfer
     *
     *
     * Adreslenevilir resorce
     * kaynaklara erişim uniqe /tekil bir identier ile ulaşılabilir olmalıdır.
     * her kaynak/resorce URi ile adreslenebilr olamalıdır
     *
     *
     *
     * // scheme://host:port/path?queryString#fragment
     // scheme -> kullanilan protocol , http , https , ftp
     // host -> dns adi ya ip adresi olabilir
     // port -> optional
     // path ve queryString

     // http://example.com/customers?lastName=Erguder&zipcode=34000

     // ### Representation Oriented
     // representation -> XML , JSON gibi formatlar araciligiyla exchange ediyoruz.
     // HTTP GET istediginde bulunduguumuzda , ilgili kaynagin mevcut durumunu/ representation íni aliriz.

     // ### The Uniform , Constrained Interface

     // This means that you don’t have an “action” parameter in your URI and use only
     // the methods of HTTP for your web services.

     // uri bilgiinsde bir actrion paremetresi gonderip , bu parametreye gore akis kontrolu YAPMA!


     // GET
     // serverdan bir kaynak/resource isteginde bulundugumuzda GET i kullaniriz.

     // idempotent ->
     // bir islem/istek/operation yaptigimizda , bunu kacdefa yaptigimizn bir onermi yoktur.
     // sonuc her zaman aynidir.
     // GET dogasi geregi idempotent ozellik gosterir;

     //public int getNumber() {
     //	return 100;
     //}

     //Idempotent means that no matter how many times you apply the operation,
     //the result is always the same.

     // POST
     // non-idempotent ozellige sahiptir.
     // islemi kac defa uyguladigimiz onemlidir, her defasinda sonuc degisecektir.

     // private int number =10;
     //public int getNumber() {
     //	return ++number;
     //}

     // create resource , post icin uygun olacaktir.

     // PUT
     // put update/guncelleme amaciyla tercih edilir.
     // put da , get gibi idempotent ozellige sahiptir!
     // bir dosyayi kaydetmeyi dusunelim ;
     // 1 kez kaydettigimizde (update) olur. sonrasindaki kaydetme islemleri(degisiklik yapmadan) bir sey ifade etmez.
     // put un mantigida bu sekilde calismalidir. bu nedenle idempotent ozellik gosterir.

     //POST means “create new” as in “Here is the input for creating a user, create it for me”.
     //PUT means “insert, replace if already exists” as in “Here is the data for user 5”.


     // DELETE
     // remove/delete resource
     // idempotent ozellik gosterir.



     */




}
