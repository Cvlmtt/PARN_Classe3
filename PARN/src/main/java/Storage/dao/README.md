# Cosa Mette a disposizione JpaRepository?
## Semplicemente:

| Sr.No | Method & Description |
|-------|----------------------|
| 1     | count(): long <br> returns the number of entities available. |
| 2     | delete(Object entity): void <br> deletes an entity. |
| 3     | deleteAll(): void <br> deletes all the entities. |
| 4     | deleteAll(Iterable< extends Object > entities): void <br> deletes the entities passed as argument. |
| 5     | deleteAll(Iterable< extends Integer > ids): void <br> deletes the entities identified using their ids passed as argument. |
| 6     | existsById(Integer id): boolean <br> checks if an entity exists using its id. |
| 7     | findAll(): Iterable< Object > <br> returns all the entities. |
| 8     | findAllByIds(Iterable< Integer > ids): Iterable< Object > <br> returns all the entities identified using ids passed as argument. |
| 9     | findById(Integer id): Optional< Object > <br> returns an entity identified using id. |
| 10    | save(Object entity): Object <br> saves an entity and return the updated one. |
| 11    | saveAll(Iterable< Object > entities): Iterable< Object > <br> saves all entities passed and return the updated entities. |
