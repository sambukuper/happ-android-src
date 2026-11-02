.class public Lql0;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# static fields
.field public static final a:Lql0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lql0;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lql0;->a:Lql0;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public a(Ly53;Lxm0;)V
    .locals 12

    .line 1
    sget-object p0, Ler8;->M:Lzx;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    invoke-interface {p1, p0, v0}, Lb76;->a(Lzx;Ljava/lang/Object;)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    check-cast p0, Lym0;

    .line 9
    .line 10
    sget-object v1, Lqd5;->Z:Lqd5;

    .line 11
    .line 12
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    sget-object v2, Lym0;->f:Lzx;

    .line 16
    .line 17
    new-instance v2, Ljava/util/HashSet;

    .line 18
    .line 19
    invoke-direct {v2}, Ljava/util/HashSet;-><init>()V

    .line 20
    .line 21
    .line 22
    invoke-static {}, Lk05;->j()Lk05;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    new-instance v4, Ljava/util/ArrayList;

    .line 27
    .line 28
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 29
    .line 30
    .line 31
    invoke-static {}, La15;->a()La15;

    .line 32
    .line 33
    .line 34
    move-result-object v5

    .line 35
    new-instance v6, Lym0;

    .line 36
    .line 37
    new-instance v7, Ljava/util/ArrayList;

    .line 38
    .line 39
    invoke-direct {v7, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 40
    .line 41
    .line 42
    invoke-static {v3}, Lqd5;->c(Ll11;)Lqd5;

    .line 43
    .line 44
    .line 45
    move-result-object v8

    .line 46
    new-instance v10, Ljava/util/ArrayList;

    .line 47
    .line 48
    invoke-direct {v10, v4}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 49
    .line 50
    .line 51
    sget-object v2, Ld18;->b:Ld18;

    .line 52
    .line 53
    new-instance v2, Landroid/util/ArrayMap;

    .line 54
    .line 55
    invoke-direct {v2}, Landroid/util/ArrayMap;-><init>()V

    .line 56
    .line 57
    .line 58
    iget-object v3, v5, Ld18;->a:Landroid/util/ArrayMap;

    .line 59
    .line 60
    invoke-virtual {v3}, Landroid/util/ArrayMap;->keySet()Ljava/util/Set;

    .line 61
    .line 62
    .line 63
    move-result-object v4

    .line 64
    invoke-interface {v4}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 65
    .line 66
    .line 67
    move-result-object v4

    .line 68
    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 69
    .line 70
    .line 71
    move-result v5

    .line 72
    if-eqz v5, :cond_0

    .line 73
    .line 74
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v5

    .line 78
    check-cast v5, Ljava/lang/String;

    .line 79
    .line 80
    invoke-virtual {v3, v5}, Landroid/util/ArrayMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v9

    .line 84
    invoke-virtual {v2, v5, v9}, Landroid/util/ArrayMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    goto :goto_0

    .line 88
    :cond_0
    new-instance v11, Ld18;

    .line 89
    .line 90
    invoke-direct {v11, v2}, Ld18;-><init>(Landroid/util/ArrayMap;)V

    .line 91
    .line 92
    .line 93
    const/4 v9, -0x1

    .line 94
    invoke-direct/range {v6 .. v11}, Lym0;-><init>(Ljava/util/ArrayList;Lqd5;ILjava/util/ArrayList;Ld18;)V

    .line 95
    .line 96
    .line 97
    if-eqz p0, :cond_2

    .line 98
    .line 99
    iget v1, p0, Lym0;->c:I

    .line 100
    .line 101
    iget-object v2, p0, Lym0;->d:Ljava/util/List;

    .line 102
    .line 103
    invoke-virtual {p2, v2}, Lxm0;->b(Ljava/util/Collection;)V

    .line 104
    .line 105
    .line 106
    iget-object v2, p0, Lym0;->b:Lqd5;

    .line 107
    .line 108
    iget-object v3, p0, Lym0;->e:Ld18;

    .line 109
    .line 110
    iget-object v4, p2, Lxm0;->h0:Ljava/lang/Object;

    .line 111
    .line 112
    check-cast v4, La15;

    .line 113
    .line 114
    iget-object v4, v4, Ld18;->a:Landroid/util/ArrayMap;

    .line 115
    .line 116
    iget-object v3, v3, Ld18;->a:Landroid/util/ArrayMap;

    .line 117
    .line 118
    invoke-virtual {v4, v3}, Landroid/util/ArrayMap;->putAll(Ljava/util/Map;)V

    .line 119
    .line 120
    .line 121
    iget-object p0, p0, Lym0;->a:Ljava/util/ArrayList;

    .line 122
    .line 123
    invoke-static {p0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 124
    .line 125
    .line 126
    move-result-object p0

    .line 127
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 128
    .line 129
    .line 130
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 131
    .line 132
    .line 133
    move-result-object p0

    .line 134
    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 135
    .line 136
    .line 137
    move-result v3

    .line 138
    if-eqz v3, :cond_1

    .line 139
    .line 140
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    move-result-object v3

    .line 144
    check-cast v3, Lwg1;

    .line 145
    .line 146
    iget-object v4, p2, Lxm0;->f0:Ljava/lang/Object;

    .line 147
    .line 148
    check-cast v4, Ljava/util/HashSet;

    .line 149
    .line 150
    invoke-virtual {v4, v3}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 151
    .line 152
    .line 153
    goto :goto_1

    .line 154
    :cond_1
    move p0, v1

    .line 155
    move-object v1, v2

    .line 156
    goto :goto_2

    .line 157
    :cond_2
    const/4 p0, -0x1

    .line 158
    :goto_2
    invoke-static {v1}, Lk05;->k(Ll11;)Lk05;

    .line 159
    .line 160
    .line 161
    move-result-object v1

    .line 162
    iput-object v1, p2, Lxm0;->g0:Ljava/lang/Object;

    .line 163
    .line 164
    new-instance v1, Lgg0;

    .line 165
    .line 166
    sget-object v1, Lgg0;->j0:Lzx;

    .line 167
    .line 168
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 169
    .line 170
    .line 171
    move-result-object p0

    .line 172
    invoke-interface {p1, v1, p0}, Ll11;->a(Lzx;Ljava/lang/Object;)Ljava/lang/Object;

    .line 173
    .line 174
    .line 175
    move-result-object p0

    .line 176
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 177
    .line 178
    .line 179
    check-cast p0, Ljava/lang/Number;

    .line 180
    .line 181
    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    .line 182
    .line 183
    .line 184
    move-result p0

    .line 185
    iput p0, p2, Lxm0;->Y:I

    .line 186
    .line 187
    sget-object p0, Lgg0;->m0:Lzx;

    .line 188
    .line 189
    invoke-interface {p1, p0, v0}, Ll11;->a(Lzx;Ljava/lang/Object;)Ljava/lang/Object;

    .line 190
    .line 191
    .line 192
    move-result-object p0

    .line 193
    check-cast p0, Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;

    .line 194
    .line 195
    if-eqz p0, :cond_3

    .line 196
    .line 197
    new-instance v0, Lol0;

    .line 198
    .line 199
    invoke-direct {v0, p0}, Lol0;-><init>(Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;)V

    .line 200
    .line 201
    .line 202
    invoke-virtual {p2, v0}, Lxm0;->c(Lxg0;)V

    .line 203
    .line 204
    .line 205
    :cond_3
    new-instance p0, Lfg0;

    .line 206
    .line 207
    const/4 v0, 0x2

    .line 208
    invoke-direct {p0, v0}, Lfg0;-><init>(B)V

    .line 209
    .line 210
    .line 211
    new-instance v0, Ljn0;

    .line 212
    .line 213
    const/4 v1, 0x0

    .line 214
    invoke-direct {v0, p0, p1, v1}, Ljn0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 215
    .line 216
    .line 217
    invoke-interface {p1, v0}, Ll11;->g(Ljn0;)V

    .line 218
    .line 219
    .line 220
    new-instance p1, Lwl6;

    .line 221
    .line 222
    iget-object p0, p0, Lfg0;->Y:Lk05;

    .line 223
    .line 224
    invoke-static {p0}, Lqd5;->c(Ll11;)Lqd5;

    .line 225
    .line 226
    .line 227
    move-result-object p0

    .line 228
    const/16 v0, 0x12

    .line 229
    .line 230
    invoke-direct {p1, p0, v0}, Lwl6;-><init>(Ljava/lang/Object;B)V

    .line 231
    .line 232
    .line 233
    invoke-virtual {p2, p1}, Lxm0;->d(Ll11;)V

    .line 234
    .line 235
    .line 236
    return-void
.end method
