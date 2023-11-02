package com.codingjx.leetcodetips;

import com.codingjx.fundamental.testing.scrapbook.A;

import java.util.*;
import java.util.stream.Collectors;

public class ArrayListTips {
    public static void main(String[] args) {
        /**
         *  Initialization
         */
        // option 1
        List list = new ArrayList();

        // option 2, initialize an ArrayList with a size of 50
        list = new ArrayList(50);

        // option 3, initialize an ArrayList using existing Collection
        List list2 = new ArrayList(list);

        // Initialize an ArrayList with size = 10 and default value = 100
        ArrayList<Integer> arrayList = new ArrayList<>(Collections.nCopies(10, 100));
        System.out.println("arrayList: " + arrayList);
        System.out.println();

        /**
         *  Insertion
         */
        // Inserting a single element at the end
        arrayList.add(1);
        System.out.println("arrayList: " + arrayList);
        System.out.println();

        // Inserting a single element at a given index
        arrayList.add(0, 1);
        System.out.println("arrayList: " + arrayList);
        System.out.println();

        // Inserting multiple elements from another Collection at a particular index
        ArrayList<Integer> tempList = new ArrayList<>(Arrays.asList(1, 2, 3));
        arrayList.addAll(1, tempList);
        System.out.println("arrayList: " + arrayList);
        System.out.println();

        /**
         *  Fetching elements
         */
        System.out.println(arrayList.get(1));
        System.out.println(arrayList.get(2));
        System.out.println(arrayList.size());
        System.out.println();

        /**
         *  Remove element
         */
        // Remove an element at a particular index
        arrayList.remove(0);
        System.out.println("arrayList: " + arrayList);
        System.out.println();

        // Remove a particular element
        arrayList.remove(new Integer(1));
        System.out.println("arrayList: " + arrayList);
        System.out.println();

        // Remove all elements within a given Collection
        arrayList.removeAll(Arrays.asList(1, 2, 3));
        System.out.println("arrayList: " + arrayList);
        System.out.println();

        // Remove all elements
        arrayList.clear();
        System.out.println("arrayList: " + arrayList);
        System.out.println();

        /**
         *  Modify element
         */
        // Replace all elements
        arrayList.addAll(Collections.nCopies(5, 23));
        arrayList.replaceAll(element -> element + 100);
        System.out.println("arrayList: " + arrayList);
        System.out.println();

        // Update an element
        arrayList.set(0, -123);
        System.out.println("arrayList: " + arrayList);
        System.out.println();

        /**
         *  Filter element
         */
        List<Integer> collects = arrayList.stream().filter(elem -> elem == 123).collect(Collectors.toList());
        System.out.println("collects: " + collects);
        System.out.println();

        /**
         *  Checking element
         */
        System.out.println(arrayList.contains(123));
        System.out.println(arrayList.indexOf(-123));
        System.out.println(arrayList.lastIndexOf(123));
        System.out.println("arrayList: " + arrayList);
        System.out.println();

        /**
         *  Iteration
         */
        Iterator<Integer> itr = arrayList.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        /**
         *  Delete through iteration
         */
        itr = arrayList.iterator();
        while (itr.hasNext()) {
            int curValue = itr.next();
            if (curValue == -123) {
                itr.remove();
            }
        }
        System.out.println("arrayList: " + arrayList);
        System.out.println();

        /**
         *  ListIterator
         */
        // Traversing elements
        arrayList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        ListIterator<Integer> listIterator = arrayList.listIterator();
        System.out.println("Forward Direction Iteration:");
        while (listIterator.hasNext()) {
            System.out.println("Next element is " + listIterator.next() +
                               " and next index is " + listIterator.nextIndex());

        }
        System.out.println();

        // Traversing elements, the iterator is at the end at this point
        System.out.println("Backward Direction Iteration:");
        while (listIterator.hasPrevious()) {
            System.out.println("Previous element is " + listIterator.previous() +
                               " and previous index is " + listIterator.previousIndex());
        }
        System.out.println();

        /**
         *  Sorting
         */
        // option 1
        Collections.sort(arrayList);
        System.out.println("ArrayList in asc order: " + arrayList);
        System.out.println();

        // option 2
        List<Integer> sortedArrayList = arrayList.stream().sorted().collect(Collectors.toList());
        System.out.println("sortedArrayList in asc order: " + sortedArrayList);
        System.out.println();

        // sorting in descending order
        // option 1
        Collections.sort(arrayList, Collections.reverseOrder());
        System.out.println("ArrayList in desc order: " + arrayList);
        System.out.println();

        // option 2
        sortedArrayList = arrayList.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println("sortedArrayList in desc order: " + sortedArrayList);
        System.out.println();

        // sorting custom class, compareTo() sort by age in asc order
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Jane", 29));
        employees.add(new Employee("Alex", 41));
        employees.add(new Employee("Gatby", 17));
        employees.add(new Employee("Roy", 72));

        Collections.sort(employees);
        System.out.println("employees in asc age order: " + employees);
        System.out.println();

        // sorting custom class, compareTo() sort by brand name
        ArrayList<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(new Vehicle("Volkswagen", 2010));
        vehicles.add(new Vehicle("Audi", 2009));
        vehicles.add(new Vehicle("Ford", 2001));
        vehicles.add(new Vehicle("BMW", 2015));
        System.out.println("vehicles sorted in dictionary order: " + vehicles);
        System.out.println();

        // sorting custom class using comparator's compare()
        ArrayList<AirPlane> airPlanes = new ArrayList<>();
        airPlanes.add(new AirPlane("Boeing", 1995));
        airPlanes.add(new AirPlane("NASA", 2017));
        airPlanes.add(new AirPlane("Airbus", 2010));
        Collections.sort(airPlanes, new BrandComparator());
        System.out.println("Sorting by brand name.");
        System.out.println("airPlanes: " + airPlanes);
        System.out.println();

        Collections.sort(airPlanes, new MakeYearComparator());
        System.out.println("Sorting by make year.");
        System.out.println("airPlanes: " + airPlanes);
        System.out.println();

        // without creating separate class that implements Comparator
        Collections.sort(airPlanes, new Comparator<AirPlane>() {
            @Override
            public int compare(AirPlane o1, AirPlane o2) {
                return o1.brand.compareTo(o2.brand);
            }
        });
        System.out.println("Sorting by make year.");
        System.out.println("airPlanes: " + airPlanes);
        System.out.println();

        // further simplify using lambda expression
        Collections.sort(airPlanes, (airplane1, airplane2) -> airplane2.makeYear.compareTo(airplane1.makeYear));
        System.out.println("Sorting by make year in desc order.");
        System.out.println("airPlanes: " + airPlanes);
        System.out.println();
    }
}
