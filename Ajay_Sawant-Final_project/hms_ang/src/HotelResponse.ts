export interface HotelResponse {
    httpstatus: string
    response: Response[]
    message: string
  }
  
  export interface Response {
    id: number
    name: string
    imageUrl: string
    roomPrice: number
    description: string
    rating: number
    city: string
    email: string
    wifi: boolean
    gym: boolean
    pool: boolean
    createdAt: string
    updatedAt: string
  }