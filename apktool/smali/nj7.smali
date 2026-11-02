.class public final Lnj7;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public a:Lur3;

.field public b:Ltr3;

.field public c:Ljava/lang/String;

.field public d:Lvh8;


# virtual methods
.method public final a(Ll37;Ldh8;Ljava/util/ArrayList;)Lsi8;
    .locals 11

    .line 1
    iget-object v0, p0, Lnj7;->a:Lur3;

    .line 2
    .line 3
    sget-object v1, Lur3;->Y:Lur3;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    if-ne v0, v1, :cond_0

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    iget-object v0, p2, Ldh8;->j0:Ljava/lang/Class;

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/lang/Class;->isPrimitive()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    :goto_0
    return-object v2

    .line 18
    :cond_1
    iget-object v0, p0, Lnj7;->a:Lur3;

    .line 19
    .line 20
    sget-object v1, Lur3;->Z:Lur3;

    .line 21
    .line 22
    if-ne v0, v1, :cond_2

    .line 23
    .line 24
    sget-object p0, Lku;->d:Lku;

    .line 25
    .line 26
    return-object p0

    .line 27
    :cond_2
    iget-object v0, p1, Lvp4;->Y:Ll20;

    .line 28
    .line 29
    iget-object v0, v0, Ll20;->X:Luh8;

    .line 30
    .line 31
    sget-object v1, Lxp4;->E0:Lxp4;

    .line 32
    .line 33
    invoke-virtual {p1, v1}, Lvp4;->f(Lxp4;)Z

    .line 34
    .line 35
    .line 36
    iget-object v1, p0, Lnj7;->d:Lvh8;

    .line 37
    .line 38
    const/4 v3, 0x3

    .line 39
    const/4 v4, 0x2

    .line 40
    const/4 v5, 0x1

    .line 41
    const/4 v6, 0x4

    .line 42
    if-eqz v1, :cond_3

    .line 43
    .line 44
    goto/16 :goto_6

    .line 45
    .line 46
    :cond_3
    iget-object v1, p0, Lnj7;->a:Lur3;

    .line 47
    .line 48
    if-eqz v1, :cond_15

    .line 49
    .line 50
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 51
    .line 52
    .line 53
    move-result v1

    .line 54
    if-eqz v1, :cond_f

    .line 55
    .line 56
    if-eq v1, v5, :cond_e

    .line 57
    .line 58
    if-eq v1, v4, :cond_d

    .line 59
    .line 60
    const/16 v7, 0x2e

    .line 61
    .line 62
    if-eq v1, v3, :cond_9

    .line 63
    .line 64
    if-eq v1, v6, :cond_5

    .line 65
    .line 66
    const/4 p1, 0x5

    .line 67
    if-ne v1, p1, :cond_4

    .line 68
    .line 69
    goto/16 :goto_5

    .line 70
    .line 71
    :cond_4
    const-string p1, "Do not know how to construct standard type id resolver for idType: "

    .line 72
    .line 73
    iget-object p0, p0, Lnj7;->a:Lur3;

    .line 74
    .line 75
    invoke-static {p0, p1}, Lbt;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    return-object v2

    .line 79
    :cond_5
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 80
    .line 81
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 82
    .line 83
    .line 84
    sget-object v1, Lxp4;->z0:Lxp4;

    .line 85
    .line 86
    invoke-virtual {p1, v1}, Lvp4;->f(Lxp4;)Z

    .line 87
    .line 88
    .line 89
    if-eqz p3, :cond_8

    .line 90
    .line 91
    invoke-interface {p3}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 92
    .line 93
    .line 94
    move-result-object p3

    .line 95
    :goto_1
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    .line 96
    .line 97
    .line 98
    move-result v1

    .line 99
    if-eqz v1, :cond_8

    .line 100
    .line 101
    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object v1

    .line 105
    check-cast v1, Lf25;

    .line 106
    .line 107
    iget-object v8, v1, Lf25;->X:Ljava/lang/Class;

    .line 108
    .line 109
    iget-object v1, v1, Lf25;->Z:Ljava/lang/String;

    .line 110
    .line 111
    if-eqz v1, :cond_6

    .line 112
    .line 113
    goto :goto_2

    .line 114
    :cond_6
    invoke-virtual {v8}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object v1

    .line 118
    invoke-virtual {v1, v7}, Ljava/lang/String;->lastIndexOf(I)I

    .line 119
    .line 120
    .line 121
    move-result v9

    .line 122
    const/16 v10, 0x24

    .line 123
    .line 124
    invoke-virtual {v1, v10}, Ljava/lang/String;->lastIndexOf(I)I

    .line 125
    .line 126
    .line 127
    move-result v10

    .line 128
    invoke-static {v9, v10}, Ljava/lang/Math;->max(II)I

    .line 129
    .line 130
    .line 131
    move-result v9

    .line 132
    if-gez v9, :cond_7

    .line 133
    .line 134
    goto :goto_2

    .line 135
    :cond_7
    add-int/lit8 v9, v9, 0x1

    .line 136
    .line 137
    invoke-virtual {v1, v9}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 138
    .line 139
    .line 140
    move-result-object v1

    .line 141
    :goto_2
    invoke-virtual {v8}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 142
    .line 143
    .line 144
    move-result-object v8

    .line 145
    invoke-virtual {v0, v8, v1}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    goto :goto_1

    .line 149
    :cond_8
    new-instance v1, Lw97;

    .line 150
    .line 151
    invoke-direct {v1, p1, p2, v0, v2}, Lw97;-><init>(Ll37;Ldh8;Ljava/util/concurrent/ConcurrentHashMap;Ljava/util/HashMap;)V

    .line 152
    .line 153
    .line 154
    goto :goto_6

    .line 155
    :cond_9
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 156
    .line 157
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 158
    .line 159
    .line 160
    sget-object v1, Lxp4;->z0:Lxp4;

    .line 161
    .line 162
    invoke-virtual {p1, v1}, Lvp4;->f(Lxp4;)Z

    .line 163
    .line 164
    .line 165
    if-eqz p3, :cond_c

    .line 166
    .line 167
    invoke-interface {p3}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 168
    .line 169
    .line 170
    move-result-object p3

    .line 171
    :goto_3
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    .line 172
    .line 173
    .line 174
    move-result v1

    .line 175
    if-eqz v1, :cond_c

    .line 176
    .line 177
    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 178
    .line 179
    .line 180
    move-result-object v1

    .line 181
    check-cast v1, Lf25;

    .line 182
    .line 183
    iget-object v8, v1, Lf25;->X:Ljava/lang/Class;

    .line 184
    .line 185
    iget-object v1, v1, Lf25;->Z:Ljava/lang/String;

    .line 186
    .line 187
    if-eqz v1, :cond_a

    .line 188
    .line 189
    goto :goto_4

    .line 190
    :cond_a
    invoke-virtual {v8}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 191
    .line 192
    .line 193
    move-result-object v1

    .line 194
    invoke-virtual {v1, v7}, Ljava/lang/String;->lastIndexOf(I)I

    .line 195
    .line 196
    .line 197
    move-result v9

    .line 198
    if-gez v9, :cond_b

    .line 199
    .line 200
    goto :goto_4

    .line 201
    :cond_b
    add-int/lit8 v9, v9, 0x1

    .line 202
    .line 203
    invoke-virtual {v1, v9}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 204
    .line 205
    .line 206
    move-result-object v1

    .line 207
    :goto_4
    invoke-virtual {v8}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 208
    .line 209
    .line 210
    move-result-object v8

    .line 211
    invoke-virtual {v0, v8, v1}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 212
    .line 213
    .line 214
    goto :goto_3

    .line 215
    :cond_c
    new-instance v1, Lfi8;

    .line 216
    .line 217
    invoke-direct {v1, p1, p2, v0, v2}, Lfi8;-><init>(Ll37;Ldh8;Ljava/util/concurrent/ConcurrentHashMap;Ljava/util/HashMap;)V

    .line 218
    .line 219
    .line 220
    goto :goto_6

    .line 221
    :cond_d
    new-instance v1, Luv4;

    .line 222
    .line 223
    invoke-direct {v1, p2, v0, p3}, Luv4;-><init>(Ldh8;Luh8;Ljava/util/Collection;)V

    .line 224
    .line 225
    .line 226
    goto :goto_6

    .line 227
    :cond_e
    :goto_5
    new-instance v1, Lat0;

    .line 228
    .line 229
    invoke-direct {v1, p2, v0, p3}, Lat0;-><init>(Ldh8;Luh8;Ljava/util/Collection;)V

    .line 230
    .line 231
    .line 232
    goto :goto_6

    .line 233
    :cond_f
    move-object v1, v2

    .line 234
    :goto_6
    iget-object p1, p0, Lnj7;->b:Ltr3;

    .line 235
    .line 236
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 237
    .line 238
    .line 239
    move-result p1

    .line 240
    if-eqz p1, :cond_14

    .line 241
    .line 242
    if-eq p1, v5, :cond_13

    .line 243
    .line 244
    if-eq p1, v4, :cond_12

    .line 245
    .line 246
    if-eq p1, v3, :cond_11

    .line 247
    .line 248
    if-ne p1, v6, :cond_10

    .line 249
    .line 250
    new-instance p1, Llu;

    .line 251
    .line 252
    iget-object p0, p0, Lnj7;->c:Ljava/lang/String;

    .line 253
    .line 254
    invoke-direct {p1, v1, v2, p0}, Lnu;-><init>(Lvh8;Ld50;Ljava/lang/String;)V

    .line 255
    .line 256
    .line 257
    return-object p1

    .line 258
    :cond_10
    const-string p1, "Do not know how to construct standard type serializer for inclusion type: "

    .line 259
    .line 260
    iget-object p0, p0, Lnj7;->b:Ltr3;

    .line 261
    .line 262
    invoke-static {p0, p1}, Lbt;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 263
    .line 264
    .line 265
    return-object v2

    .line 266
    :cond_11
    new-instance p1, Lmu;

    .line 267
    .line 268
    iget-object p0, p0, Lnj7;->c:Ljava/lang/String;

    .line 269
    .line 270
    invoke-direct {p1, v1, v2, p0}, Lmu;-><init>(Lvh8;Ld50;Ljava/lang/String;)V

    .line 271
    .line 272
    .line 273
    return-object p1

    .line 274
    :cond_12
    new-instance p0, Lku;

    .line 275
    .line 276
    invoke-direct {p0, v1, v2, v5}, Lku;-><init>(Lvh8;Ld50;B)V

    .line 277
    .line 278
    .line 279
    return-object p0

    .line 280
    :cond_13
    new-instance p0, Lku;

    .line 281
    .line 282
    invoke-direct {p0, v1, v2, v4}, Lku;-><init>(Lvh8;Ld50;B)V

    .line 283
    .line 284
    .line 285
    return-object p0

    .line 286
    :cond_14
    new-instance p1, Lnu;

    .line 287
    .line 288
    iget-object p0, p0, Lnj7;->c:Ljava/lang/String;

    .line 289
    .line 290
    invoke-direct {p1, v1, v2, p0}, Lnu;-><init>(Lvh8;Ld50;Ljava/lang/String;)V

    .line 291
    .line 292
    .line 293
    return-object p1

    .line 294
    :cond_15
    const-string p0, "Cannot build, \'init()\' not yet called"

    .line 295
    .line 296
    invoke-static {p0}, Lbt;->i(Ljava/lang/String;)V

    .line 297
    .line 298
    .line 299
    return-object v2
.end method

.method public final b(Lwr3;)V
    .locals 2

    .line 1
    iget-object v0, p1, Lwr3;->X:Lur3;

    .line 2
    .line 3
    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    iput-object v0, p0, Lnj7;->a:Lur3;

    .line 7
    .line 8
    iget-object v1, p1, Lwr3;->Y:Ltr3;

    .line 9
    .line 10
    iput-object v1, p0, Lnj7;->b:Ltr3;

    .line 11
    .line 12
    iget-object p1, p1, Lwr3;->Z:Ljava/lang/String;

    .line 13
    .line 14
    if-eqz p1, :cond_0

    .line 15
    .line 16
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    if-eqz v1, :cond_1

    .line 21
    .line 22
    :cond_0
    iget-object p1, v0, Lur3;->X:Ljava/lang/String;

    .line 23
    .line 24
    :cond_1
    iput-object p1, p0, Lnj7;->c:Ljava/lang/String;

    .line 25
    .line 26
    return-void
.end method
