package com.restfullapi.api;

import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.restfullapi.api.Entities.Departement;
import com.restfullapi.api.Entities.Employes;
import com.restfullapi.api.Entities.TypeConges;
import com.restfullapi.api.Pattern.Composite.File;
import com.restfullapi.api.Pattern.Composite.Folder;
import com.restfullapi.api.Pattern.Decorator.Boisson;
import com.restfullapi.api.Pattern.Decorator.CaramelDecorator;
import com.restfullapi.api.Pattern.Decorator.ChocolatDecorator;
import com.restfullapi.api.Pattern.Decorator.Expresso;
import com.restfullapi.api.Pattern.Observer.ObservableImpl;
import com.restfullapi.api.Pattern.Observer.Observer;
import com.restfullapi.api.Pattern.Observer.ObserverImpl1;
import com.restfullapi.api.Pattern.Observer.ObserverImpl2;
import com.restfullapi.api.Pattern.Proxy.Client;
import com.restfullapi.api.Pattern.Proxy.Proxy;
import com.restfullapi.api.Pattern.Proxy.StandardImpl1;
import com.restfullapi.api.Pattern.Singleton.PatternSignleton;
import com.restfullapi.api.Pattern.Strategy.Context;
import com.restfullapi.api.Pattern.Strategy.StrategyImpl1;
import com.restfullapi.api.Pattern.Strategy.StrategyImpl2;
import com.restfullapi.api.Repository.DepartementRepository;
import com.restfullapi.api.Repository.EmployesRepository;
import com.restfullapi.api.Repository.TypeCongesRepository;


@SpringBootApplication
public class RestfullApplication  {

	public static void main(String[] args) {
		SpringApplication.run(RestfullApplication.class, args);
		
		/*System.out.println("..........pattern singleton...............");
		PatternSignleton p1 = PatternSignleton.getInstances();
		PatternSignleton p2 = PatternSignleton.getInstances();
		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());
		System.out.println("..........pattern Strategy");
		Context cx = new Context();
		 
		cx.process();
		cx.setStrategy(new StrategyImpl1());
		cx.process();
		cx.setStrategy(new StrategyImpl2());
		cx.process();
		System.out.println("............Pattern Observer...............");
		ObservableImpl obs = new ObservableImpl();
		Observer o1 = new ObserverImpl1();
		Observer o2 = new ObserverImpl2();
		obs.subscribe(o1);
		obs.subscribe(o2);
		obs.setState(50);
		obs.unSubscribe(o2);
		obs.subscribe(ob -> {
			System.out.println("Observateur anonyme");
		});
		obs.setState(42);
		System.out.println("********Pattern Decorator**********");
		Boisson exp = new Expresso();
		System.out.println("Commade Boisson " + exp.getDescription());
		System.out.println("Cout " + exp.cout());
		System.out.println("*******Decoration*******");
		exp=new ChocolatDecorator(exp);
		System.out.println("Commade Boisson " + exp.getDescription());
		System.out.println("Cout " + exp.cout());
		exp=new CaramelDecorator(exp);
		System.out.println("Commade Boisson " + exp.getDescription());
		System.out.println("Cout " + exp.cout());
		System.out.println("********Pattern Composite**********");
		Folder root = new Folder("Root");
		Folder f1 = new Folder("Creation");
		Folder f2=new Folder("Structure");
		Folder f3 = new Folder("Comportement");
		root.addComposant(f1);
		root.addComposant(f2);
		root.addComposant(f3);
		f1.addComposant(new File("Singleton"));
		f1.addComposant(new File("Factory"));
		f2.addComposant(new File("Builder"));
		f3.addComposant(new File("Composite"));
		f1.addComposant(new Folder("Str"));
		Folder fs3 = (Folder) f1.getComponent("Str");
		fs3.addComposant(new File("Strategy"));
		fs3.addComposant(new File("Decorator"));
		root.afficher();
		System.out.println("********Pattern Proxy**********");
		Client client = new Client();
		client.setStandard(new Proxy());
		client.process();
		*/
		List<String> maListe = Arrays.asList("a1", "b1", "c3");
		maListe.stream()
		               .filter(s->s.startsWith("b"))
		               .map(String::toUpperCase)
		               .sorted()
		               .forEach(System.out::println);
	}
	
	@Bean
	CommandLineRunner start(EmployesRepository employeRepository, 
			DepartementRepository departementRepository,
			TypeCongesRepository typeCongesRepository) {
		return agrs ->{
			if(departementRepository.count() == 0) {
				departementRepository.save(new Departement("DTECH", "DEPARTEMENT TECHNIQUE", new Date(), true));
				departementRepository.save(new Departement("DFIN", "DEPARTEMENT FINANCE", new Date(), true));
				departementRepository.save(new Departement("DC", "DEPARTEMENT COMERCIAILE", new Date(), true));
			}
			if(employeRepository.count()==0) {
				Departement dep = departementRepository.findAll().get(0);
				if (dep!=null) {
					employeRepository.save(new Employes("122", "Donald", "Evrard", new Date(), true, "donald9do@gmail.com","ama", "ama",null, dep, null));
					employeRepository.save(new Employes("145", "Evann", "Noe", new Date(), true, "eban@gmail.com","lau", "lau",null, dep, null));
				}
			}
			//api stream utilisé pour le traitement des collections d'object. java 8
			if(typeCongesRepository.count()==0) {
				Stream.of("Maladie", "Accouchement", "Annuel","Permission")
				  .forEach(name ->{
					  TypeConges typeConges = new TypeConges();
					  typeConges.setDateCreation(new Date());
					  typeConges.setNom(name);
					  typeConges.setStatus(true);
					  typeCongesRepository.save(typeConges);
				  });
			}
		};
	}

}
