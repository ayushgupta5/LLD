# Google Map System

This project simulates a basic Google Maps-like system using Java. It includes features such as setting a map center, zooming in and out, adding/removing markers, calculating routes, displaying traffic, and managing map layers like satellite view.

## Class and Method Descriptions:

### 1. **MapService**

This class manages displaying the map, zooming, and setting the map center.

#### Attributes:
- **currentLocation**: Holds the current location on the map.
- **zoomLevel**: Stores the current zoom level of the map.

#### Functions:
- **displayMap()**: Displays the map on the screen.
- **setCenter(location: Location)**: Sets the center of the map to the given location.
- **zoomIn()**: Increases the zoom level.
- **zoomOut()**: Decreases the zoom level.
---

### 2. **Location**

This class represents a geographical location with latitude, longitude, and name.

#### Attributes:
- **latitude**: Latitude coordinate of the location.
- **longitude**: Longitude coordinate of the location.
- **name**: Name of the location (e.g., "San Francisco").

#### Functions:
- **getCoordinates()**: Returns the latitude and longitude of the location.

---

### 3. **RouteService**

This class calculates routes between two locations.

#### Functions:
- **calculateRoute(start: Location, end: Location)**: Calculates the route between the start and end locations.

---

### 4. **Marker**

This class manages map markers (points of interest) that can be added or removed from the map.

#### Attributes:
- **location**: The location where the marker is placed.

#### Functions:
- **addMarker(location: Location)**: Adds a marker at the specified location.
- **removeMarker()**: Removes the marker from the map.

---

### 5. **TrafficService**

This class manages displaying traffic information on the map.

#### Functions:
- **displayTraffic()**: Displays traffic information on the map.
- **getTrafficInfo()**: Retrieves current traffic data.

---

### 6. **MapLayer**

This class is used to manage different types of map layers (e.g., satellite view, terrain view).

#### Attributes:
- **layerType**: The type of map layer (e.g., "satellite", "terrain").

#### Functions:
- **enableLayer()**: Enables the specified map layer.
- **disableLayer()**: Disables the map layer.

---

## Project Structure:

