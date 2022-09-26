### "Fitness"

There are three types of memberships in the fitness club:

1. One-time (for one day). With a one-time membership, owner can access the pool and gym from 8 to 10.
2. Daily. With this pass, owner can use the gym and group classes (but not the pool) from 8 to 16.
3. Full. With this membership, owner can access the gym, pool and group classes from 8 to 22.

Each membership stores the registration date (current date) and the registration end date. Each membership stores information
about the owner. 

Information about the owner: first name, last name, year of birth.

Fitness contains information about memberships that:

1) registered in the gym (membership array);
2) registered in the pool (membership array);
3) registered in group classes (membership array).

In each zone (pool, gym, group classes) only 20 memberships can be registered at the same time.

When the fitness club closes, owner leave it (array with null elements).

The owner cannot pass:

1) if the membership is expired,
2) if he tries to enter a zone that is not allowed on his membership,
3) if there are no free places in the zone.
4) according to the age 

A membership cannot be registered in several zones at the same time.
