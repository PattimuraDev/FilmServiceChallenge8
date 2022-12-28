package org.example.scheduler;

import org.example.model.Film;
import org.example.service.FilmServiceImpl;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.quartz.QuartzJobBean;

import java.util.List;

public class FilmScheduler extends QuartzJobBean {

    @Autowired
    public FilmServiceImpl filmService;

    private static final Logger LOG = LoggerFactory.getLogger(FilmScheduler.class);

    @Override
    protected void executeInternal(JobExecutionContext context) throws JobExecutionException {
        LOG.info("\nscheduler is running : ");
        List<Film> listFilmIsPlaying = filmService.getFilmIsPlaying();
        for(Film i : listFilmIsPlaying){
            LOG.info("Film {} sedang tayang", i.getFilmName());
        }
    }
}
