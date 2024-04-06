package br.ueg.musica.mapper;

import br.ueg.musica.dto.MusicaDto;
import br.ueg.musica.model.MusicaModel;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-04-05T22:43:18-0300",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 17.0.10 (Oracle Corporation)"
)
@Component
public class MusicaMapperImpl implements MusicaMapper {

    @Override
    public MusicaModel toModelo(MusicaDto musicaDto) {
        if ( musicaDto == null ) {
            return null;
        }

        MusicaModel musicaModel = new MusicaModel();

        musicaModel.setNomeBanda( musicaDto.getNomeBanda() );
        musicaModel.setNomeMusica( musicaDto.getNomeMusica() );
        musicaModel.setNomeAlbum( musicaDto.getNomeAlbum() );
        musicaModel.setDataLancamento( musicaDto.getDataLancamento() );
        musicaModel.setDuracao( musicaDto.getDuracao() );

        return musicaModel;
    }

    @Override
    public MusicaDto toMusicaDto(MusicaModel musicaModel) {
        if ( musicaModel == null ) {
            return null;
        }

        MusicaDto musicaDto = new MusicaDto();

        musicaDto.setNomeBanda( musicaModel.getNomeBanda() );
        musicaDto.setNomeMusica( musicaModel.getNomeMusica() );
        musicaDto.setNomeAlbum( musicaModel.getNomeAlbum() );
        musicaDto.setDataLancamento( musicaModel.getDataLancamento() );
        musicaDto.setDuracao( musicaModel.getDuracao() );

        return musicaDto;
    }

    @Override
    public List<MusicaDto> toListDto(List<MusicaModel> musicaModelList) {
        if ( musicaModelList == null ) {
            return null;
        }

        List<MusicaDto> list = new ArrayList<MusicaDto>( musicaModelList.size() );
        for ( MusicaModel musicaModel : musicaModelList ) {
            list.add( toMusicaDto( musicaModel ) );
        }

        return list;
    }
}
