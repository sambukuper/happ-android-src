.class public final Lj$/time/format/n;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lj$/time/format/e;


# instance fields
.field public final a:Lj$/time/temporal/TemporalField;

.field public final b:Lj$/time/format/w;

.field public final c:Lj$/time/format/a;

.field public volatile d:Lj$/time/format/h;


# direct methods
.method public constructor <init>(Lj$/time/temporal/TemporalField;Lj$/time/format/w;Lj$/time/format/a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lj$/time/format/n;->a:Lj$/time/temporal/TemporalField;

    .line 5
    .line 6
    iput-object p2, p0, Lj$/time/format/n;->b:Lj$/time/format/w;

    .line 7
    .line 8
    iput-object p3, p0, Lj$/time/format/n;->c:Lj$/time/format/a;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final t(Lj$/time/format/q;Ljava/lang/StringBuilder;)Z
    .locals 5

    .line 1
    iget-object v0, p0, Lj$/time/format/n;->a:Lj$/time/temporal/TemporalField;

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Lj$/time/format/q;->a(Lj$/time/temporal/TemporalField;)Ljava/lang/Long;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p1, Lj$/time/format/q;->b:Lj$/time/format/DateTimeFormatter;

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    const/4 p0, 0x0

    .line 12
    return p0

    .line 13
    :cond_0
    iget-object v2, p1, Lj$/time/format/q;->a:Lj$/time/temporal/TemporalAccessor;

    .line 14
    .line 15
    sget-object v3, Lj$/time/temporal/p;->b:Lj$/time/e;

    .line 16
    .line 17
    invoke-interface {v2, v3}, Lj$/time/temporal/TemporalAccessor;->d(Lj$/time/temporal/TemporalQuery;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    check-cast v2, Lj$/time/chrono/k;

    .line 22
    .line 23
    if-eqz v2, :cond_2

    .line 24
    .line 25
    sget-object v3, Lj$/time/chrono/r;->c:Lj$/time/chrono/r;

    .line 26
    .line 27
    if-ne v2, v3, :cond_1

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_1
    iget-object v2, p0, Lj$/time/format/n;->c:Lj$/time/format/a;

    .line 31
    .line 32
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 33
    .line 34
    .line 35
    move-result-wide v3

    .line 36
    iget-object v0, p0, Lj$/time/format/n;->b:Lj$/time/format/w;

    .line 37
    .line 38
    iget-object v1, v1, Lj$/time/format/DateTimeFormatter;->b:Ljava/util/Locale;

    .line 39
    .line 40
    iget-object v1, v2, Lj$/time/format/a;->a:Lj$/time/format/s;

    .line 41
    .line 42
    invoke-virtual {v1, v3, v4, v0}, Lj$/time/format/s;->a(JLj$/time/format/w;)Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    goto :goto_1

    .line 47
    :cond_2
    :goto_0
    iget-object v2, p0, Lj$/time/format/n;->c:Lj$/time/format/a;

    .line 48
    .line 49
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 50
    .line 51
    .line 52
    move-result-wide v3

    .line 53
    iget-object v0, p0, Lj$/time/format/n;->b:Lj$/time/format/w;

    .line 54
    .line 55
    iget-object v1, v1, Lj$/time/format/DateTimeFormatter;->b:Ljava/util/Locale;

    .line 56
    .line 57
    iget-object v1, v2, Lj$/time/format/a;->a:Lj$/time/format/s;

    .line 58
    .line 59
    invoke-virtual {v1, v3, v4, v0}, Lj$/time/format/s;->a(JLj$/time/format/w;)Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    :goto_1
    const/4 v1, 0x1

    .line 64
    if-nez v0, :cond_4

    .line 65
    .line 66
    iget-object v0, p0, Lj$/time/format/n;->d:Lj$/time/format/h;

    .line 67
    .line 68
    if-nez v0, :cond_3

    .line 69
    .line 70
    new-instance v0, Lj$/time/format/h;

    .line 71
    .line 72
    iget-object v2, p0, Lj$/time/format/n;->a:Lj$/time/temporal/TemporalField;

    .line 73
    .line 74
    const/16 v3, 0x13

    .line 75
    .line 76
    sget-object v4, Lj$/time/format/SignStyle;->NORMAL:Lj$/time/format/SignStyle;

    .line 77
    .line 78
    invoke-direct {v0, v2, v1, v3, v4}, Lj$/time/format/h;-><init>(Lj$/time/temporal/TemporalField;IILj$/time/format/SignStyle;)V

    .line 79
    .line 80
    .line 81
    iput-object v0, p0, Lj$/time/format/n;->d:Lj$/time/format/h;

    .line 82
    .line 83
    :cond_3
    iget-object p0, p0, Lj$/time/format/n;->d:Lj$/time/format/h;

    .line 84
    .line 85
    invoke-virtual {p0, p1, p2}, Lj$/time/format/h;->t(Lj$/time/format/q;Ljava/lang/StringBuilder;)Z

    .line 86
    .line 87
    .line 88
    move-result p0

    .line 89
    return p0

    .line 90
    :cond_4
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 91
    .line 92
    .line 93
    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 4

    .line 1
    sget-object v0, Lj$/time/format/w;->FULL:Lj$/time/format/w;

    .line 2
    .line 3
    const-string v1, ")"

    .line 4
    .line 5
    const-string v2, "Text("

    .line 6
    .line 7
    iget-object v3, p0, Lj$/time/format/n;->b:Lj$/time/format/w;

    .line 8
    .line 9
    iget-object p0, p0, Lj$/time/format/n;->a:Lj$/time/temporal/TemporalField;

    .line 10
    .line 11
    if-ne v3, v0, :cond_0

    .line 12
    .line 13
    new-instance v0, Ljava/lang/StringBuilder;

    .line 14
    .line 15
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    return-object p0

    .line 29
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 30
    .line 31
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    const-string p0, ","

    .line 38
    .line 39
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    return-object p0
.end method

.method public final x(Lj$/time/format/o;Ljava/lang/CharSequence;I)I
    .locals 11

    .line 1
    iget-object v2, p0, Lj$/time/format/n;->c:Lj$/time/format/a;

    .line 2
    .line 3
    iget-object v7, p0, Lj$/time/format/n;->a:Lj$/time/temporal/TemporalField;

    .line 4
    .line 5
    invoke-interface {p2}, Ljava/lang/CharSequence;->length()I

    .line 6
    .line 7
    .line 8
    move-result v3

    .line 9
    if-ltz p3, :cond_b

    .line 10
    .line 11
    if-gt p3, v3, :cond_b

    .line 12
    .line 13
    iget-boolean v3, p1, Lj$/time/format/o;->c:Z

    .line 14
    .line 15
    iget-object v5, p1, Lj$/time/format/o;->a:Lj$/time/format/DateTimeFormatter;

    .line 16
    .line 17
    const/4 v6, 0x0

    .line 18
    if-eqz v3, :cond_0

    .line 19
    .line 20
    iget-object v3, p0, Lj$/time/format/n;->b:Lj$/time/format/w;

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    move-object v3, v6

    .line 24
    :goto_0
    invoke-virtual {p1}, Lj$/time/format/o;->c()Lj$/time/format/u;

    .line 25
    .line 26
    .line 27
    move-result-object v8

    .line 28
    iget-object v8, v8, Lj$/time/format/u;->c:Lj$/time/chrono/k;

    .line 29
    .line 30
    if-nez v8, :cond_1

    .line 31
    .line 32
    iget-object v8, p1, Lj$/time/format/o;->a:Lj$/time/format/DateTimeFormatter;

    .line 33
    .line 34
    iget-object v8, v8, Lj$/time/format/DateTimeFormatter;->d:Lj$/time/chrono/k;

    .line 35
    .line 36
    if-nez v8, :cond_1

    .line 37
    .line 38
    sget-object v8, Lj$/time/chrono/r;->c:Lj$/time/chrono/r;

    .line 39
    .line 40
    :cond_1
    if-eqz v8, :cond_4

    .line 41
    .line 42
    sget-object v9, Lj$/time/chrono/r;->c:Lj$/time/chrono/r;

    .line 43
    .line 44
    if-ne v8, v9, :cond_2

    .line 45
    .line 46
    goto :goto_2

    .line 47
    :cond_2
    iget-object v2, v2, Lj$/time/format/a;->a:Lj$/time/format/s;

    .line 48
    .line 49
    iget-object v2, v2, Lj$/time/format/s;->b:Ljava/util/Map;

    .line 50
    .line 51
    check-cast v2, Ljava/util/HashMap;

    .line 52
    .line 53
    invoke-virtual {v2, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v2

    .line 57
    check-cast v2, Ljava/util/List;

    .line 58
    .line 59
    if-eqz v2, :cond_3

    .line 60
    .line 61
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 62
    .line 63
    .line 64
    move-result-object v6

    .line 65
    :cond_3
    :goto_1
    move-object v9, v6

    .line 66
    goto :goto_3

    .line 67
    :cond_4
    :goto_2
    iget-object v5, v5, Lj$/time/format/DateTimeFormatter;->b:Ljava/util/Locale;

    .line 68
    .line 69
    iget-object v2, v2, Lj$/time/format/a;->a:Lj$/time/format/s;

    .line 70
    .line 71
    iget-object v2, v2, Lj$/time/format/s;->b:Ljava/util/Map;

    .line 72
    .line 73
    check-cast v2, Ljava/util/HashMap;

    .line 74
    .line 75
    invoke-virtual {v2, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object v2

    .line 79
    check-cast v2, Ljava/util/List;

    .line 80
    .line 81
    if-eqz v2, :cond_3

    .line 82
    .line 83
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 84
    .line 85
    .line 86
    move-result-object v6

    .line 87
    goto :goto_1

    .line 88
    :goto_3
    if-eqz v9, :cond_9

    .line 89
    .line 90
    :cond_5
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 91
    .line 92
    .line 93
    move-result v2

    .line 94
    if-eqz v2, :cond_6

    .line 95
    .line 96
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object v2

    .line 100
    move-object v10, v2

    .line 101
    check-cast v10, Ljava/util/Map$Entry;

    .line 102
    .line 103
    invoke-interface {v10}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object v2

    .line 107
    check-cast v2, Ljava/lang/String;

    .line 108
    .line 109
    const/4 v3, 0x0

    .line 110
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 111
    .line 112
    .line 113
    move-result v6

    .line 114
    move-object v1, p1

    .line 115
    move-object v4, p2

    .line 116
    move v5, p3

    .line 117
    invoke-virtual/range {v1 .. v6}, Lj$/time/format/o;->g(Ljava/lang/CharSequence;ILjava/lang/CharSequence;II)Z

    .line 118
    .line 119
    .line 120
    move-result v3

    .line 121
    if-eqz v3, :cond_5

    .line 122
    .line 123
    iget-object v1, p0, Lj$/time/format/n;->a:Lj$/time/temporal/TemporalField;

    .line 124
    .line 125
    invoke-interface {v10}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    move-result-object v0

    .line 129
    check-cast v0, Ljava/lang/Long;

    .line 130
    .line 131
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 132
    .line 133
    .line 134
    move-result-wide v3

    .line 135
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 136
    .line 137
    .line 138
    move-result v0

    .line 139
    add-int v5, v0, p3

    .line 140
    .line 141
    move-object v0, p1

    .line 142
    move-wide v2, v3

    .line 143
    move v4, p3

    .line 144
    invoke-virtual/range {v0 .. v5}, Lj$/time/format/o;->f(Lj$/time/temporal/TemporalField;JII)I

    .line 145
    .line 146
    .line 147
    move-result v0

    .line 148
    return v0

    .line 149
    :cond_6
    sget-object v2, Lj$/time/temporal/ChronoField;->ERA:Lj$/time/temporal/ChronoField;

    .line 150
    .line 151
    if-ne v7, v2, :cond_8

    .line 152
    .line 153
    iget-boolean v2, p1, Lj$/time/format/o;->c:Z

    .line 154
    .line 155
    if-nez v2, :cond_8

    .line 156
    .line 157
    invoke-interface {v8}, Lj$/time/chrono/k;->w()Ljava/util/List;

    .line 158
    .line 159
    .line 160
    move-result-object v2

    .line 161
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 162
    .line 163
    .line 164
    move-result-object v7

    .line 165
    :cond_7
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 166
    .line 167
    .line 168
    move-result v2

    .line 169
    if-eqz v2, :cond_8

    .line 170
    .line 171
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 172
    .line 173
    .line 174
    move-result-object v2

    .line 175
    move-object v8, v2

    .line 176
    check-cast v8, Lj$/time/chrono/l;

    .line 177
    .line 178
    invoke-virtual {v8}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 179
    .line 180
    .line 181
    move-result-object v2

    .line 182
    const/4 v3, 0x0

    .line 183
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 184
    .line 185
    .line 186
    move-result v6

    .line 187
    move-object v1, p1

    .line 188
    move-object v4, p2

    .line 189
    move v5, p3

    .line 190
    invoke-virtual/range {v1 .. v6}, Lj$/time/format/o;->g(Ljava/lang/CharSequence;ILjava/lang/CharSequence;II)Z

    .line 191
    .line 192
    .line 193
    move-result v3

    .line 194
    if-eqz v3, :cond_7

    .line 195
    .line 196
    iget-object v1, p0, Lj$/time/format/n;->a:Lj$/time/temporal/TemporalField;

    .line 197
    .line 198
    invoke-interface {v8}, Lj$/time/chrono/l;->getValue()I

    .line 199
    .line 200
    .line 201
    move-result v0

    .line 202
    int-to-long v3, v0

    .line 203
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 204
    .line 205
    .line 206
    move-result v0

    .line 207
    add-int v5, v0, p3

    .line 208
    .line 209
    move-object v0, p1

    .line 210
    move-wide v2, v3

    .line 211
    move v4, p3

    .line 212
    invoke-virtual/range {v0 .. v5}, Lj$/time/format/o;->f(Lj$/time/temporal/TemporalField;JII)I

    .line 213
    .line 214
    .line 215
    move-result v0

    .line 216
    return v0

    .line 217
    :cond_8
    iget-boolean v2, p1, Lj$/time/format/o;->c:Z

    .line 218
    .line 219
    if-eqz v2, :cond_9

    .line 220
    .line 221
    not-int v0, p3

    .line 222
    return v0

    .line 223
    :cond_9
    iget-object v2, p0, Lj$/time/format/n;->d:Lj$/time/format/h;

    .line 224
    .line 225
    if-nez v2, :cond_a

    .line 226
    .line 227
    new-instance v2, Lj$/time/format/h;

    .line 228
    .line 229
    iget-object v3, p0, Lj$/time/format/n;->a:Lj$/time/temporal/TemporalField;

    .line 230
    .line 231
    const/16 v5, 0x13

    .line 232
    .line 233
    sget-object v6, Lj$/time/format/SignStyle;->NORMAL:Lj$/time/format/SignStyle;

    .line 234
    .line 235
    const/4 v7, 0x1

    .line 236
    invoke-direct {v2, v3, v7, v5, v6}, Lj$/time/format/h;-><init>(Lj$/time/temporal/TemporalField;IILj$/time/format/SignStyle;)V

    .line 237
    .line 238
    .line 239
    iput-object v2, p0, Lj$/time/format/n;->d:Lj$/time/format/h;

    .line 240
    .line 241
    :cond_a
    iget-object v0, p0, Lj$/time/format/n;->d:Lj$/time/format/h;

    .line 242
    .line 243
    invoke-virtual {v0, p1, p2, p3}, Lj$/time/format/h;->x(Lj$/time/format/o;Ljava/lang/CharSequence;I)I

    .line 244
    .line 245
    .line 246
    move-result v0

    .line 247
    return v0

    .line 248
    :cond_b
    new-instance v0, Ljava/lang/IndexOutOfBoundsException;

    .line 249
    .line 250
    invoke-direct {v0}, Ljava/lang/IndexOutOfBoundsException;-><init>()V

    .line 251
    .line 252
    .line 253
    throw v0
.end method
