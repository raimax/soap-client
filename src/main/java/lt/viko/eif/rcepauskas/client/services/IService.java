package lt.viko.eif.rcepauskas.client.services;

import lt.viko.eif.rcepauskas.client.ServiceStatus;

import java.util.List;

public interface IService<T> {
    <T> Object get(Integer id);
    <T> List<Object> getAll();
    ServiceStatus insert(T t);
    ServiceStatus update(T t);
    ServiceStatus delete(Integer id);
}
