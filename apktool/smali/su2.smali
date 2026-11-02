.class public final Lsu2;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# static fields
.field public static final l:Lsj2;

.field public static final m:Lmj0;

.field public static final n:Lcom/google/gson/internal/bind/JsonAdapterAnnotationTypeAdapterFactory;

.field public static final o:Lsu2;

.field public static final p:Ljava/util/List;

.field public static final q:I

.field public static final r:I

.field public static final s:I


# instance fields
.field public final a:Lcom/google/gson/internal/Excluder;

.field public final b:Ljava/util/HashMap;

.field public final c:Ljava/util/ArrayList;

.field public final d:Ljava/util/ArrayList;

.field public e:Z

.field public f:Lsj2;

.field public final g:Ljava/util/ArrayDeque;

.field public final h:I

.field public i:I

.field public final j:I

.field public final k:I


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    sget-object v0, Lsj2;->d:Lsj2;

    .line 2
    .line 3
    sput-object v0, Lsu2;->l:Lsj2;

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    sput v0, Lsu2;->q:I

    .line 7
    .line 8
    sput v0, Lsu2;->r:I

    .line 9
    .line 10
    const/4 v0, 0x2

    .line 11
    sput v0, Lsu2;->s:I

    .line 12
    .line 13
    new-instance v0, Lmj0;

    .line 14
    .line 15
    sget-object v1, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    .line 16
    .line 17
    sget-object v2, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 18
    .line 19
    const/16 v3, 0x9

    .line 20
    .line 21
    const/4 v4, 0x0

    .line 22
    invoke-direct {v0, v3, v1, v2, v4}, Lmj0;-><init>(BLjava/lang/Object;Ljava/lang/Object;Z)V

    .line 23
    .line 24
    .line 25
    sput-object v0, Lsu2;->m:Lmj0;

    .line 26
    .line 27
    new-instance v1, Lcom/google/gson/internal/bind/JsonAdapterAnnotationTypeAdapterFactory;

    .line 28
    .line 29
    invoke-direct {v1, v0}, Lcom/google/gson/internal/bind/JsonAdapterAnnotationTypeAdapterFactory;-><init>(Lmj0;)V

    .line 30
    .line 31
    .line 32
    sput-object v1, Lsu2;->n:Lcom/google/gson/internal/bind/JsonAdapterAnnotationTypeAdapterFactory;

    .line 33
    .line 34
    new-instance v2, Lsu2;

    .line 35
    .line 36
    invoke-direct {v2}, Lsu2;-><init>()V

    .line 37
    .line 38
    .line 39
    sput-object v2, Lsu2;->o:Lsu2;

    .line 40
    .line 41
    invoke-virtual {v2, v0, v1}, Lsu2;->a(Lmj0;Lcom/google/gson/internal/bind/JsonAdapterAnnotationTypeAdapterFactory;)Ljava/util/List;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    sput-object v0, Lsu2;->p:Ljava/util/List;

    .line 46
    .line 47
    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Lcom/google/gson/internal/Excluder;->Z:Lcom/google/gson/internal/Excluder;

    .line 5
    .line 6
    iput-object v0, p0, Lsu2;->a:Lcom/google/gson/internal/Excluder;

    .line 7
    .line 8
    sget v0, Lsu2;->q:I

    .line 9
    .line 10
    iput v0, p0, Lsu2;->h:I

    .line 11
    .line 12
    new-instance v0, Ljava/util/HashMap;

    .line 13
    .line 14
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 15
    .line 16
    .line 17
    iput-object v0, p0, Lsu2;->b:Ljava/util/HashMap;

    .line 18
    .line 19
    new-instance v0, Ljava/util/ArrayList;

    .line 20
    .line 21
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 22
    .line 23
    .line 24
    iput-object v0, p0, Lsu2;->c:Ljava/util/ArrayList;

    .line 25
    .line 26
    new-instance v0, Ljava/util/ArrayList;

    .line 27
    .line 28
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 29
    .line 30
    .line 31
    iput-object v0, p0, Lsu2;->d:Ljava/util/ArrayList;

    .line 32
    .line 33
    const/4 v0, 0x1

    .line 34
    iput-boolean v0, p0, Lsu2;->e:Z

    .line 35
    .line 36
    sget-object v0, Lsu2;->l:Lsj2;

    .line 37
    .line 38
    iput-object v0, p0, Lsu2;->f:Lsj2;

    .line 39
    .line 40
    const/4 v0, 0x0

    .line 41
    iput v0, p0, Lsu2;->i:I

    .line 42
    .line 43
    sget v0, Lsu2;->r:I

    .line 44
    .line 45
    iput v0, p0, Lsu2;->j:I

    .line 46
    .line 47
    sget v0, Lsu2;->s:I

    .line 48
    .line 49
    iput v0, p0, Lsu2;->k:I

    .line 50
    .line 51
    new-instance v0, Ljava/util/ArrayDeque;

    .line 52
    .line 53
    invoke-direct {v0}, Ljava/util/ArrayDeque;-><init>()V

    .line 54
    .line 55
    .line 56
    iput-object v0, p0, Lsu2;->g:Ljava/util/ArrayDeque;

    .line 57
    .line 58
    return-void
.end method

.method public static b(Ljava/util/AbstractCollection;)Ljava/util/List;
    .locals 2

    .line 1
    invoke-interface {p0}, Ljava/util/Collection;->isEmpty()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    sget-object p0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 8
    .line 9
    return-object p0

    .line 10
    :cond_0
    invoke-interface {p0}, Ljava/util/Collection;->size()I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    const/4 v1, 0x1

    .line 15
    if-ne v0, v1, :cond_2

    .line 16
    .line 17
    instance-of v0, p0, Ljava/util/List;

    .line 18
    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    check-cast p0, Ljava/util/List;

    .line 22
    .line 23
    const/4 v0, 0x0

    .line 24
    invoke-interface {p0, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    goto :goto_0

    .line 29
    :cond_1
    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    :goto_0
    invoke-static {p0}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    return-object p0

    .line 42
    :cond_2
    invoke-interface {p0}, Ljava/util/Collection;->toArray()[Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    invoke-static {p0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    invoke-static {p0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    return-object p0
.end method


# virtual methods
.method public final a(Lmj0;Lcom/google/gson/internal/bind/JsonAdapterAnnotationTypeAdapterFactory;)Ljava/util/List;
    .locals 8

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    sget-object v1, Lcom/google/gson/internal/bind/b;->B:Lvg8;

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    iget v1, p0, Lsu2;->j:I

    .line 12
    .line 13
    invoke-static {v1}, Lcom/google/gson/internal/bind/ObjectTypeAdapter;->d(I)Lvg8;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    iget-object v1, p0, Lsu2;->a:Lcom/google/gson/internal/Excluder;

    .line 21
    .line 22
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    iget-object v1, p0, Lsu2;->c:Ljava/util/ArrayList;

    .line 26
    .line 27
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    if-nez v2, :cond_0

    .line 32
    .line 33
    new-instance v2, Ljava/util/ArrayList;

    .line 34
    .line 35
    invoke-direct {v2, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 36
    .line 37
    .line 38
    invoke-static {v2}, Ljava/util/Collections;->reverse(Ljava/util/List;)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 42
    .line 43
    .line 44
    :cond_0
    iget-object v1, p0, Lsu2;->d:Ljava/util/ArrayList;

    .line 45
    .line 46
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 47
    .line 48
    .line 49
    move-result v2

    .line 50
    if-nez v2, :cond_1

    .line 51
    .line 52
    new-instance v2, Ljava/util/ArrayList;

    .line 53
    .line 54
    invoke-direct {v2, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 55
    .line 56
    .line 57
    invoke-static {v2}, Ljava/util/Collections;->reverse(Ljava/util/List;)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 61
    .line 62
    .line 63
    :cond_1
    sget-object v1, Lcom/google/gson/internal/sql/a;->a:Ljava/util/List;

    .line 64
    .line 65
    sget-object v1, Lcom/google/gson/internal/bind/b;->r:Lvg8;

    .line 66
    .line 67
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    sget-object v1, Lcom/google/gson/internal/bind/b;->g:Lvg8;

    .line 71
    .line 72
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    sget-object v1, Lcom/google/gson/internal/bind/b;->d:Lvg8;

    .line 76
    .line 77
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 78
    .line 79
    .line 80
    sget-object v1, Lcom/google/gson/internal/bind/b;->e:Lvg8;

    .line 81
    .line 82
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 83
    .line 84
    .line 85
    sget-object v1, Lcom/google/gson/internal/bind/b;->f:Lvg8;

    .line 86
    .line 87
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 88
    .line 89
    .line 90
    sget-object v1, Lcom/google/gson/internal/bind/b;->k:Lcom/google/gson/b;

    .line 91
    .line 92
    sget-object v2, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 93
    .line 94
    const-class v3, Ljava/lang/Long;

    .line 95
    .line 96
    invoke-static {v2, v3, v1}, Lcom/google/gson/internal/bind/b;->f(Ljava/lang/Class;Ljava/lang/Class;Lcom/google/gson/b;)Lvg8;

    .line 97
    .line 98
    .line 99
    move-result-object v2

    .line 100
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 101
    .line 102
    .line 103
    const-class v2, Ljava/lang/Double;

    .line 104
    .line 105
    sget-object v3, Lcom/google/gson/internal/bind/b;->m:Lcom/google/gson/b;

    .line 106
    .line 107
    sget-object v4, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    .line 108
    .line 109
    invoke-static {v4, v2, v3}, Lcom/google/gson/internal/bind/b;->f(Ljava/lang/Class;Ljava/lang/Class;Lcom/google/gson/b;)Lvg8;

    .line 110
    .line 111
    .line 112
    move-result-object v2

    .line 113
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 114
    .line 115
    .line 116
    const-class v2, Ljava/lang/Float;

    .line 117
    .line 118
    sget-object v3, Lcom/google/gson/internal/bind/b;->l:Lcom/google/gson/b;

    .line 119
    .line 120
    sget-object v4, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    .line 121
    .line 122
    invoke-static {v4, v2, v3}, Lcom/google/gson/internal/bind/b;->f(Ljava/lang/Class;Ljava/lang/Class;Lcom/google/gson/b;)Lvg8;

    .line 123
    .line 124
    .line 125
    move-result-object v2

    .line 126
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 127
    .line 128
    .line 129
    const/4 v2, 0x2

    .line 130
    iget v3, p0, Lsu2;->k:I

    .line 131
    .line 132
    if-ne v3, v2, :cond_2

    .line 133
    .line 134
    sget-object v2, Lcom/google/gson/internal/bind/NumberTypeAdapter;->b:Lvg8;

    .line 135
    .line 136
    goto :goto_0

    .line 137
    :cond_2
    invoke-static {v3}, Lcom/google/gson/internal/bind/NumberTypeAdapter;->d(I)Lvg8;

    .line 138
    .line 139
    .line 140
    move-result-object v2

    .line 141
    :goto_0
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 142
    .line 143
    .line 144
    sget-object v2, Lcom/google/gson/internal/bind/b;->h:Lvg8;

    .line 145
    .line 146
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 147
    .line 148
    .line 149
    sget-object v2, Lcom/google/gson/internal/bind/b;->i:Lvg8;

    .line 150
    .line 151
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 152
    .line 153
    .line 154
    const-class v2, Ljava/util/concurrent/atomic/AtomicLong;

    .line 155
    .line 156
    invoke-static {v1}, Lcom/google/gson/internal/bind/b;->a(Lcom/google/gson/b;)Lcom/google/gson/b;

    .line 157
    .line 158
    .line 159
    move-result-object v3

    .line 160
    invoke-static {v2, v3}, Lcom/google/gson/internal/bind/b;->e(Ljava/lang/Class;Lcom/google/gson/b;)Lvg8;

    .line 161
    .line 162
    .line 163
    move-result-object v2

    .line 164
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 165
    .line 166
    .line 167
    const-class v2, Ljava/util/concurrent/atomic/AtomicLongArray;

    .line 168
    .line 169
    invoke-static {v1}, Lcom/google/gson/internal/bind/b;->b(Lcom/google/gson/b;)Lcom/google/gson/b;

    .line 170
    .line 171
    .line 172
    move-result-object v1

    .line 173
    invoke-static {v2, v1}, Lcom/google/gson/internal/bind/b;->e(Ljava/lang/Class;Lcom/google/gson/b;)Lvg8;

    .line 174
    .line 175
    .line 176
    move-result-object v1

    .line 177
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 178
    .line 179
    .line 180
    sget-object v1, Lcom/google/gson/internal/bind/b;->j:Lvg8;

    .line 181
    .line 182
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 183
    .line 184
    .line 185
    sget-object v1, Lcom/google/gson/internal/bind/b;->n:Lvg8;

    .line 186
    .line 187
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 188
    .line 189
    .line 190
    sget-object v1, Lcom/google/gson/internal/bind/b;->s:Lvg8;

    .line 191
    .line 192
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 193
    .line 194
    .line 195
    sget-object v1, Lcom/google/gson/internal/bind/b;->t:Lvg8;

    .line 196
    .line 197
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 198
    .line 199
    .line 200
    sget-object v1, Lcom/google/gson/internal/bind/b;->o:Lvg8;

    .line 201
    .line 202
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 203
    .line 204
    .line 205
    sget-object v1, Lcom/google/gson/internal/bind/b;->p:Lvg8;

    .line 206
    .line 207
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 208
    .line 209
    .line 210
    sget-object v1, Lcom/google/gson/internal/bind/b;->q:Lvg8;

    .line 211
    .line 212
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 213
    .line 214
    .line 215
    sget-object v1, Lcom/google/gson/internal/bind/b;->u:Lvg8;

    .line 216
    .line 217
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 218
    .line 219
    .line 220
    sget-object v1, Lcom/google/gson/internal/bind/b;->v:Lvg8;

    .line 221
    .line 222
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 223
    .line 224
    .line 225
    sget-object v1, Lcom/google/gson/internal/bind/b;->x:Lvg8;

    .line 226
    .line 227
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 228
    .line 229
    .line 230
    sget-object v1, Lcom/google/gson/internal/bind/b;->y:Lvg8;

    .line 231
    .line 232
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 233
    .line 234
    .line 235
    sget-object v1, Lcom/google/gson/internal/bind/b;->A:Lvg8;

    .line 236
    .line 237
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 238
    .line 239
    .line 240
    sget-object v1, Lcom/google/gson/internal/bind/b;->w:Lvg8;

    .line 241
    .line 242
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 243
    .line 244
    .line 245
    sget-object v1, Lcom/google/gson/internal/bind/b;->b:Lvg8;

    .line 246
    .line 247
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 248
    .line 249
    .line 250
    sget-object v1, Lcom/google/gson/internal/bind/DefaultDateTypeAdapter;->c:Lvg8;

    .line 251
    .line 252
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 253
    .line 254
    .line 255
    sget-object v1, Lcom/google/gson/internal/bind/b;->z:Lvg8;

    .line 256
    .line 257
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 258
    .line 259
    .line 260
    const/4 v1, 0x0

    .line 261
    :try_start_0
    const-class v2, Lcom/google/gson/internal/bind/JavaTimeTypeAdapters;

    .line 262
    .line 263
    sget-object v3, Lcom/google/gson/internal/bind/JavaTimeTypeAdapters;->a:Lcom/google/gson/b;

    .line 264
    .line 265
    invoke-virtual {v2, v1}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 266
    .line 267
    .line 268
    move-result-object v2

    .line 269
    invoke-virtual {v2, v1}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 270
    .line 271
    .line 272
    move-result-object v2

    .line 273
    check-cast v2, Lwg8;

    .line 274
    .line 275
    check-cast v2, Lcom/google/gson/internal/bind/JavaTimeTypeAdapters;

    .line 276
    .line 277
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 278
    .line 279
    .line 280
    sget-object v1, Lcom/google/gson/internal/bind/JavaTimeTypeAdapters;->j:Lvg8;
    :try_end_0
    .catch Ljava/lang/ReflectiveOperationException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/LinkageError; {:try_start_0 .. :try_end_0} :catch_0

    .line 281
    .line 282
    :catch_0
    if-eqz v1, :cond_3

    .line 283
    .line 284
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 285
    .line 286
    .line 287
    :cond_3
    sget-object v1, Lcom/google/gson/internal/sql/a;->a:Ljava/util/List;

    .line 288
    .line 289
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 290
    .line 291
    .line 292
    sget-object v1, Lcom/google/gson/internal/bind/ArrayTypeAdapter;->c:Lvg8;

    .line 293
    .line 294
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 295
    .line 296
    .line 297
    sget-object v1, Lcom/google/gson/internal/bind/b;->a:Lvg8;

    .line 298
    .line 299
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 300
    .line 301
    .line 302
    new-instance v1, Lcom/google/gson/internal/bind/CollectionTypeAdapterFactory;

    .line 303
    .line 304
    invoke-direct {v1, p1}, Lcom/google/gson/internal/bind/CollectionTypeAdapterFactory;-><init>(Lmj0;)V

    .line 305
    .line 306
    .line 307
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 308
    .line 309
    .line 310
    new-instance v1, Lcom/google/gson/internal/bind/MapTypeAdapterFactory;

    .line 311
    .line 312
    invoke-direct {v1, p1}, Lcom/google/gson/internal/bind/MapTypeAdapterFactory;-><init>(Lmj0;)V

    .line 313
    .line 314
    .line 315
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 316
    .line 317
    .line 318
    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 319
    .line 320
    .line 321
    sget-object v1, Lcom/google/gson/internal/bind/b;->C:Lvg8;

    .line 322
    .line 323
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 324
    .line 325
    .line 326
    new-instance v2, Lcom/google/gson/internal/bind/ReflectiveTypeAdapterFactory;

    .line 327
    .line 328
    iget-object v1, p0, Lsu2;->g:Ljava/util/ArrayDeque;

    .line 329
    .line 330
    invoke-static {v1}, Lsu2;->b(Ljava/util/AbstractCollection;)Ljava/util/List;

    .line 331
    .line 332
    .line 333
    move-result-object v7

    .line 334
    iget v4, p0, Lsu2;->h:I

    .line 335
    .line 336
    iget-object v5, p0, Lsu2;->a:Lcom/google/gson/internal/Excluder;

    .line 337
    .line 338
    move-object v3, p1

    .line 339
    move-object v6, p2

    .line 340
    invoke-direct/range {v2 .. v7}, Lcom/google/gson/internal/bind/ReflectiveTypeAdapterFactory;-><init>(Lmj0;ILcom/google/gson/internal/Excluder;Lcom/google/gson/internal/bind/JsonAdapterAnnotationTypeAdapterFactory;Ljava/util/List;)V

    .line 341
    .line 342
    .line 343
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 344
    .line 345
    .line 346
    invoke-virtual {v0}, Ljava/util/ArrayList;->trimToSize()V

    .line 347
    .line 348
    .line 349
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 350
    .line 351
    .line 352
    move-result-object p0

    .line 353
    return-object p0
.end method

.method public final c(Ljava/lang/reflect/Type;Ljava/lang/Object;)V
    .locals 2

    .line 1
    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    instance-of v0, p2, Lww2;

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    instance-of v1, p2, Lyn3;

    .line 9
    .line 10
    if-nez v1, :cond_1

    .line 11
    .line 12
    instance-of v1, p2, Lcom/google/gson/b;

    .line 13
    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    const-string p1, " does not implement any supported type adapter class or interface"

    .line 26
    .line 27
    const-string p2, "Class "

    .line 28
    .line 29
    invoke-static {p2, p0, p1}, Lu52;->m(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    return-void

    .line 33
    :cond_1
    :goto_0
    const-class v1, Ljava/lang/Object;

    .line 34
    .line 35
    if-eq p1, v1, :cond_5

    .line 36
    .line 37
    iget-object p0, p0, Lsu2;->c:Ljava/util/ArrayList;

    .line 38
    .line 39
    if-nez v0, :cond_2

    .line 40
    .line 41
    instance-of v0, p2, Lyn3;

    .line 42
    .line 43
    if-eqz v0, :cond_3

    .line 44
    .line 45
    :cond_2
    new-instance v0, Lyi8;

    .line 46
    .line 47
    invoke-direct {v0, p1}, Lyi8;-><init>(Ljava/lang/reflect/Type;)V

    .line 48
    .line 49
    .line 50
    invoke-static {v0, p2}, Lcom/google/gson/internal/bind/TreeTypeAdapter;->e(Lyi8;Ljava/lang/Object;)Lvg8;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    :cond_3
    instance-of v0, p2, Lcom/google/gson/b;

    .line 58
    .line 59
    if-eqz v0, :cond_4

    .line 60
    .line 61
    new-instance v0, Lyi8;

    .line 62
    .line 63
    invoke-direct {v0, p1}, Lyi8;-><init>(Ljava/lang/reflect/Type;)V

    .line 64
    .line 65
    .line 66
    check-cast p2, Lcom/google/gson/b;

    .line 67
    .line 68
    invoke-static {v0, p2}, Lcom/google/gson/internal/bind/b;->d(Lyi8;Lcom/google/gson/b;)Lvg8;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    :cond_4
    return-void

    .line 76
    :cond_5
    const-string p0, "Cannot override built-in adapter for "

    .line 77
    .line 78
    invoke-static {p1, p0}, Lu52;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    return-void
.end method
