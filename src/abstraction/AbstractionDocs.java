package abstraction;

public class AbstractionDocs {
	/*
	 * ================ Abstraction ====================
	 * # process of hiding implementation details.
	 * 
	 *   # To achieve abstraction :
	 *   
	 *    a> Abstract class:
	 *    	# class which contains abstract methods(unimplemented) 
	 *        and non-abstract methods (implemented) is known as abstract class.
	 *     
	 *     			# Abstract method :
	 *                   -> method which does not have implementation or body
	 *                   e.g.
	 *                    abstract void sum();
	 *                    
	 *       # every abstract class must have at least one child class
	 *        and child class must override abstract methods.
	 *        
	 *       # we can't create object of abstract class. 
	 *       
	 *       syntax :
	 *       
	 *        abstract class class_name{
	 *         
	 *           //abstract methods 
	 *             e.g.
	 *               abstract void print();
	 *           
	 *           //non-abstract methods
	 *           
	 *             e.g.
	 *               void area(){
	 *               
	 *               }
	 *         
	 *         }
	 *       
	 *    
	 *    b> Interface :
	 *     # same as class which contains public abstract methods and 
	 *       public static final variables only.
	 *       
	 *    # every interface have at least one implementation class and 
	 *      impl. class must override abstract methods.
	 *    
	 *   # we can't create object of interface.
	 *   # its a 100% abstraction. 
	 *   
	 *   syntax :
	 *   
	 *     interface interface_name{
	 *     
	 *        //public static final variables
	 *        
	 *        // public abstract methods
	 *     }
	 *     
	 *     e.g.
	 *     
	 *       interface A {
	 *       
	 *       }
	 *       
	 *       interface T{
	 *       
	 *       }
	 *       
	 *        # type_1
	 *       interface P extends A,T{
	 *       
	 *       }
	 *       
	 *       # type_2
	 *       class B implements A {
	 *       
	 *           
	 *       }
	 *       
	 *       class V{
	 *       
	 *       }
	 *       
	 *        # type_3
	 *       class C extends V implements A{
	 *       
	 *       }
	 *       
	 *       //invalid
	 *        class C implements A extends V{
	 *       
	 *       }
	 *       
	 *        # type_4
	 *        
	 *        class K implements A,T{
	 *        
	 *        }
	 *       
	 */

}
