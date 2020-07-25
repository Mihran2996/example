package gorzdnakan.demo.model.services;

import gorzdnakan.demo.model.Category;
import gorzdnakan.demo.model.Task;
import gorzdnakan.demo.model.repository.CategoryRepository;
import gorzdnakan.demo.model.repository.TaskRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
@RequiredArgsConstructor
public class TaskService {
    private final TaskRepository taskRepository;
    private final CategoryRepository categoryRepository;

    public List<Task> getAllTask()
    {
        return taskRepository.findAll();
    }


    public List  getAllCategory() {
        List<Task> tasks = taskRepository.findAll();//kbere sax tasker@;
        List<Category> orderList = categoryRepository.findAll();//kbere sax categoryner@,category-nel bdi unena count_task syun@,
        // vori mej kexni te qani hat task ka et category tak
        List<Category> topCategory = new LinkedList<>();//sig var@ petq guka
        int count1 = 0;//es cauntner@ kexnin enqan injqan or entacategory-i id ka
        int count2 = 0;
        int count3 = 0;
        for (Task task : tasks) {
            switch (task.getCategory().getId()){//vercneng@ taski category-i id-n,ete count@(aysinqn entacategory_id) havasare  taski category-i id-in count ++ kexni,
                // set u save kenenq or hishe;
                case 4:
                    count1++;
                    task.getCategory().setCount(count1);
                    taskRepository.save(task);
                    break;
                case 5:
                    count2++;
                    task.getCategory().setCount(count2);
                    taskRepository.save(task);
                    break;
                case 8:
                    count3++;
                    task.getCategory().setCount(count3);
                    taskRepository.save(task);
                    break;
            }
        }
        Collections.sort//mer unecac category ner@ ksortavorenq @st count_taski,vornel vor verev@ swich-i mej ++ e exe,
                (orderList);
        for (int i = orderList.size() - 1; i >=0; i--) {//category-i listi frov frracinq verjic vordev kdasavore achman kargov u aysinqn amenamec count_task unecox object@ verj@ kexni,
            // vercrinq amen me category-in @st ira id-i kanchinq objeqt@,u qcinq listi mej,
            Category one = categoryRepository.getOne(orderList.get(i).getId());
            topCategory.add(one);

        }
        List<Category> categories = topCategory.subList(0, 5);//stexel vercrinq listic injqan or petqe,
   return categories;//stexel kxrgenq html 
    }


}






























