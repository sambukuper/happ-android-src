.class public final Lue;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lmn0;


# instance fields
.field public final synthetic a:B

.field public final b:Lcl7;

.field public final c:Lhi0;


# direct methods
.method public constructor <init>(Ls98;Lcl7;Lhi0;B)V
    .locals 0

    .line 1
    iput-byte p4, p0, Lue;->a:B

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    packed-switch p4, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    iput-object p2, p0, Lue;->b:Lcl7;

    .line 13
    .line 14
    iput-object p3, p0, Lue;->c:Lhi0;

    .line 15
    .line 16
    return-void

    .line 17
    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    .line 19
    .line 20
    iput-object p2, p0, Lue;->b:Lcl7;

    .line 21
    .line 22
    iput-object p3, p0, Lue;->c:Lhi0;

    .line 23
    .line 24
    return-void

    .line 25
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public final a(Lyh0;Ljava/util/Map;Lsn0;)Lln0;
    .locals 6

    .line 1
    iget-byte v0, p0, Lue;->a:B

    .line 2
    .line 3
    sget-object v1, Le02;->X:Le02;

    .line 4
    .line 5
    iget-object v2, p0, Lue;->b:Lcl7;

    .line 6
    .line 7
    iget-object p0, p0, Lue;->c:Lhi0;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    sget-object v0, Loy1;->k0:Loy1;

    .line 13
    .line 14
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    invoke-static {p0, v2, p2}, Lw51;->l(Lhi0;Lcl7;Ljava/util/Map;)Lle5;

    .line 18
    .line 19
    .line 20
    move-result-object p2

    .line 21
    iget-object v2, p2, Lle5;->a:Ljava/util/ArrayList;

    .line 22
    .line 23
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    .line 24
    .line 25
    .line 26
    move-result v3

    .line 27
    if-eqz v3, :cond_0

    .line 28
    .line 29
    invoke-static {p0}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    invoke-virtual {p3}, Lsn0;->a()V

    .line 33
    .line 34
    .line 35
    goto :goto_1

    .line 36
    :cond_0
    iget-object p0, p0, Lhi0;->d:Ljava/util/ArrayList;

    .line 37
    .line 38
    if-nez p0, :cond_1

    .line 39
    .line 40
    invoke-interface {p1, v2, p3}, Lyh0;->k(Ljava/util/ArrayList;Lsn0;)Z

    .line 41
    .line 42
    .line 43
    move-result p0

    .line 44
    goto :goto_0

    .line 45
    :cond_1
    invoke-static {p0}, Lwv0;->O0(Ljava/util/List;)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    check-cast p0, Lbe3;

    .line 50
    .line 51
    iget-object p0, p0, Lbe3;->a:Lel0;

    .line 52
    .line 53
    iget-object p0, p0, Lel0;->a:Ljava/util/List;

    .line 54
    .line 55
    invoke-static {p0}, Lwv0;->O0(Ljava/util/List;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    check-cast p0, Lze5;

    .line 60
    .line 61
    new-instance v3, Lhd3;

    .line 62
    .line 63
    iget-object v4, p0, Lze5;->a:Landroid/util/Size;

    .line 64
    .line 65
    invoke-virtual {v4}, Landroid/util/Size;->getWidth()I

    .line 66
    .line 67
    .line 68
    move-result v4

    .line 69
    iget-object v5, p0, Lze5;->a:Landroid/util/Size;

    .line 70
    .line 71
    invoke-virtual {v5}, Landroid/util/Size;->getHeight()I

    .line 72
    .line 73
    .line 74
    move-result v5

    .line 75
    iget p0, p0, Lze5;->b:I

    .line 76
    .line 77
    invoke-direct {v3, v4, v5, p0}, Lhd3;-><init>(III)V

    .line 78
    .line 79
    .line 80
    invoke-interface {p1, v3, v2, p3}, Lyh0;->g(Lhd3;Ljava/util/ArrayList;Lsn0;)Z

    .line 81
    .line 82
    .line 83
    move-result p0

    .line 84
    :goto_0
    if-nez p0, :cond_2

    .line 85
    .line 86
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    invoke-virtual {p3}, Lsn0;->toString()Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    invoke-virtual {p3}, Lsn0;->a()V

    .line 93
    .line 94
    .line 95
    goto :goto_1

    .line 96
    :cond_2
    new-instance v0, Lkn0;

    .line 97
    .line 98
    iget-object p0, p2, Lle5;->d:Ljava/util/LinkedHashMap;

    .line 99
    .line 100
    invoke-direct {v0, v1, p0}, Lkn0;-><init>(Ljava/util/Map;Ljava/util/Map;)V

    .line 101
    .line 102
    .line 103
    :goto_1
    return-object v0

    .line 104
    :pswitch_0
    sget-object v0, Loy1;->k0:Loy1;

    .line 105
    .line 106
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 107
    .line 108
    .line 109
    iget-object p0, p0, Lhi0;->d:Ljava/util/ArrayList;

    .line 110
    .line 111
    if-eqz p0, :cond_4

    .line 112
    .line 113
    invoke-static {p0}, Lwv0;->O0(Ljava/util/List;)Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object p0

    .line 117
    check-cast p0, Lbe3;

    .line 118
    .line 119
    iget-object p0, p0, Lbe3;->a:Lel0;

    .line 120
    .line 121
    iget-object p0, p0, Lel0;->a:Ljava/util/List;

    .line 122
    .line 123
    invoke-static {p0}, Lwv0;->O0(Ljava/util/List;)Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    move-result-object p0

    .line 127
    check-cast p0, Lze5;

    .line 128
    .line 129
    new-instance v3, Landroid/hardware/camera2/params/InputConfiguration;

    .line 130
    .line 131
    iget-object v4, p0, Lze5;->a:Landroid/util/Size;

    .line 132
    .line 133
    invoke-virtual {v4}, Landroid/util/Size;->getWidth()I

    .line 134
    .line 135
    .line 136
    move-result v4

    .line 137
    iget-object v5, p0, Lze5;->a:Landroid/util/Size;

    .line 138
    .line 139
    invoke-virtual {v5}, Landroid/util/Size;->getHeight()I

    .line 140
    .line 141
    .line 142
    move-result v5

    .line 143
    iget p0, p0, Lze5;->b:I

    .line 144
    .line 145
    invoke-direct {v3, v4, v5, p0}, Landroid/hardware/camera2/params/InputConfiguration;-><init>(III)V

    .line 146
    .line 147
    .line 148
    new-instance p0, Ljava/util/ArrayList;

    .line 149
    .line 150
    invoke-interface {p2}, Ljava/util/Map;->size()I

    .line 151
    .line 152
    .line 153
    move-result v4

    .line 154
    invoke-direct {p0, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 155
    .line 156
    .line 157
    invoke-interface {p2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 158
    .line 159
    .line 160
    move-result-object v4

    .line 161
    invoke-interface {v4}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 162
    .line 163
    .line 164
    move-result-object v4

    .line 165
    :goto_2
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 166
    .line 167
    .line 168
    move-result v5

    .line 169
    if-eqz v5, :cond_3

    .line 170
    .line 171
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 172
    .line 173
    .line 174
    move-result-object v5

    .line 175
    check-cast v5, Ljava/util/Map$Entry;

    .line 176
    .line 177
    invoke-interface {v5}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 178
    .line 179
    .line 180
    move-result-object v5

    .line 181
    check-cast v5, Landroid/view/Surface;

    .line 182
    .line 183
    invoke-virtual {p0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 184
    .line 185
    .line 186
    goto :goto_2

    .line 187
    :cond_3
    invoke-interface {p1, v3, p0, p3}, Lyh0;->u(Landroid/hardware/camera2/params/InputConfiguration;Ljava/util/ArrayList;Lsn0;)Z

    .line 188
    .line 189
    .line 190
    move-result p0

    .line 191
    if-nez p0, :cond_6

    .line 192
    .line 193
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 194
    .line 195
    .line 196
    invoke-virtual {p3}, Lsn0;->toString()Ljava/lang/String;

    .line 197
    .line 198
    .line 199
    invoke-virtual {p3}, Lsn0;->a()V

    .line 200
    .line 201
    .line 202
    goto :goto_4

    .line 203
    :cond_4
    new-instance p0, Ljava/util/ArrayList;

    .line 204
    .line 205
    invoke-interface {p2}, Ljava/util/Map;->size()I

    .line 206
    .line 207
    .line 208
    move-result v3

    .line 209
    invoke-direct {p0, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 210
    .line 211
    .line 212
    invoke-interface {p2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 213
    .line 214
    .line 215
    move-result-object v3

    .line 216
    invoke-interface {v3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 217
    .line 218
    .line 219
    move-result-object v3

    .line 220
    :goto_3
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 221
    .line 222
    .line 223
    move-result v4

    .line 224
    if-eqz v4, :cond_5

    .line 225
    .line 226
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 227
    .line 228
    .line 229
    move-result-object v4

    .line 230
    check-cast v4, Ljava/util/Map$Entry;

    .line 231
    .line 232
    invoke-interface {v4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 233
    .line 234
    .line 235
    move-result-object v4

    .line 236
    check-cast v4, Landroid/view/Surface;

    .line 237
    .line 238
    invoke-virtual {p0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 239
    .line 240
    .line 241
    goto :goto_3

    .line 242
    :cond_5
    invoke-interface {p1, p0, p3}, Lyh0;->c0(Ljava/util/List;Lfh0;)Z

    .line 243
    .line 244
    .line 245
    move-result p0

    .line 246
    if-nez p0, :cond_6

    .line 247
    .line 248
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 249
    .line 250
    .line 251
    invoke-virtual {p3}, Lsn0;->toString()Ljava/lang/String;

    .line 252
    .line 253
    .line 254
    invoke-virtual {p3}, Lsn0;->a()V

    .line 255
    .line 256
    .line 257
    goto :goto_4

    .line 258
    :cond_6
    invoke-static {p2, v2}, Lw51;->m(Ljava/util/Map;Lcl7;)Lip4;

    .line 259
    .line 260
    .line 261
    move-result-object p0

    .line 262
    new-instance v0, Lkn0;

    .line 263
    .line 264
    invoke-direct {v0, v1, p0}, Lkn0;-><init>(Ljava/util/Map;Ljava/util/Map;)V

    .line 265
    .line 266
    .line 267
    :goto_4
    return-object v0

    .line 268
    nop

    .line 269
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
