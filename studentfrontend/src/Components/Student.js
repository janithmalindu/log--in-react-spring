import * as React from 'react';
import Box from '@mui/material/Box';
import TextField from '@mui/material/TextField';

export default function Student() {
  return (
    <Box
      component="form"
      sx={{ '& > :not(style)': { m: 3, padding:'2px'} }}
      noValidate
      autoComplete="on"
    >
          <TextField id="standard-basic" label="Frist Name" variant="standard"/><br/>
      <TextField id="standard-basic" label="Address" variant="standard" /><br/>
      <button id="submit" type='submit'>Submit</button>
    </Box>
  );
}
