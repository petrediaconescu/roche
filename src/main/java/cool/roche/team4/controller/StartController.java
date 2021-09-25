package cool.roche.team4.controller;

import cool.roche.team4.service.TempListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("start")
public class StartController {

  private TempListService startService;

  @Autowired
  public StartController(TempListService startService) {
    this.startService = startService;
  }

  @PostMapping("{id}")
  public boolean start(@PathVariable int id) {
    return startService.createTempList(id);
  }

}
