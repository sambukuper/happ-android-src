.class public final Lxf8;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# static fields
.field public static final l:[Ljava/lang/String;


# instance fields
.field public final a:Landroidx/work/impl/WorkDatabase_Impl;

.field public final b:Ljava/util/LinkedHashMap;

.field public final c:Ljava/util/LinkedHashMap;

.field public final d:Z

.field public final e:Ld0;

.field public final f:Ljava/util/LinkedHashMap;

.field public final g:[Ljava/lang/String;

.field public final h:Lsa2;

.field public final i:Ljb1;

.field public final j:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public k:Ldn2;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    const-string v0, "UPDATE"

    .line 2
    .line 3
    const-string v1, "DELETE"

    .line 4
    .line 5
    const-string v2, "INSERT"

    .line 6
    .line 7
    filled-new-array {v2, v0, v1}, [Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    sput-object v0, Lxf8;->l:[Ljava/lang/String;

    .line 12
    .line 13
    return-void
.end method

.method public constructor <init>(Landroidx/work/impl/WorkDatabase_Impl;Ljava/util/LinkedHashMap;Ljava/util/LinkedHashMap;[Ljava/lang/String;ZLd0;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lxf8;->a:Landroidx/work/impl/WorkDatabase_Impl;

    .line 5
    .line 6
    iput-object p2, p0, Lxf8;->b:Ljava/util/LinkedHashMap;

    .line 7
    .line 8
    iput-object p3, p0, Lxf8;->c:Ljava/util/LinkedHashMap;

    .line 9
    .line 10
    iput-boolean p5, p0, Lxf8;->d:Z

    .line 11
    .line 12
    iput-object p6, p0, Lxf8;->e:Ld0;

    .line 13
    .line 14
    new-instance p1, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 15
    .line 16
    const/4 p2, 0x0

    .line 17
    invoke-direct {p1, p2}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 18
    .line 19
    .line 20
    iput-object p1, p0, Lxf8;->j:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 21
    .line 22
    new-instance p1, Lw60;

    .line 23
    .line 24
    const/16 p3, 0xc

    .line 25
    .line 26
    invoke-direct {p1, p3}, Lw60;-><init>(B)V

    .line 27
    .line 28
    .line 29
    iput-object p1, p0, Lxf8;->k:Ldn2;

    .line 30
    .line 31
    new-instance p1, Ljava/util/LinkedHashMap;

    .line 32
    .line 33
    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    .line 34
    .line 35
    .line 36
    iput-object p1, p0, Lxf8;->f:Ljava/util/LinkedHashMap;

    .line 37
    .line 38
    array-length p1, p4

    .line 39
    new-array p3, p1, [Ljava/lang/String;

    .line 40
    .line 41
    :goto_0
    if-ge p2, p1, :cond_2

    .line 42
    .line 43
    aget-object p5, p4, p2

    .line 44
    .line 45
    sget-object p6, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 46
    .line 47
    invoke-virtual {p5, p6}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object p5

    .line 51
    invoke-virtual {p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 52
    .line 53
    .line 54
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    iget-object v1, p0, Lxf8;->f:Ljava/util/LinkedHashMap;

    .line 59
    .line 60
    invoke-interface {v1, p5, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    iget-object v0, p0, Lxf8;->b:Ljava/util/LinkedHashMap;

    .line 64
    .line 65
    aget-object v1, p4, p2

    .line 66
    .line 67
    invoke-virtual {v0, v1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    check-cast v0, Ljava/lang/String;

    .line 72
    .line 73
    if-eqz v0, :cond_0

    .line 74
    .line 75
    invoke-virtual {v0, p6}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object p6

    .line 79
    invoke-virtual {p6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 80
    .line 81
    .line 82
    goto :goto_1

    .line 83
    :cond_0
    const/4 p6, 0x0

    .line 84
    :goto_1
    if-nez p6, :cond_1

    .line 85
    .line 86
    goto :goto_2

    .line 87
    :cond_1
    move-object p5, p6

    .line 88
    :goto_2
    aput-object p5, p3, p2

    .line 89
    .line 90
    add-int/lit8 p2, p2, 0x1

    .line 91
    .line 92
    goto :goto_0

    .line 93
    :cond_2
    iput-object p3, p0, Lxf8;->g:[Ljava/lang/String;

    .line 94
    .line 95
    iget-object p1, p0, Lxf8;->b:Ljava/util/LinkedHashMap;

    .line 96
    .line 97
    invoke-virtual {p1}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    .line 98
    .line 99
    .line 100
    move-result-object p1

    .line 101
    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 102
    .line 103
    .line 104
    move-result-object p1

    .line 105
    :cond_3
    :goto_3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 106
    .line 107
    .line 108
    move-result p2

    .line 109
    if-eqz p2, :cond_4

    .line 110
    .line 111
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object p2

    .line 115
    check-cast p2, Ljava/util/Map$Entry;

    .line 116
    .line 117
    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    move-result-object p3

    .line 121
    check-cast p3, Ljava/lang/String;

    .line 122
    .line 123
    sget-object p4, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 124
    .line 125
    invoke-virtual {p3, p4}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 126
    .line 127
    .line 128
    move-result-object p3

    .line 129
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 130
    .line 131
    .line 132
    iget-object p5, p0, Lxf8;->f:Ljava/util/LinkedHashMap;

    .line 133
    .line 134
    invoke-interface {p5, p3}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 135
    .line 136
    .line 137
    move-result p5

    .line 138
    if-eqz p5, :cond_3

    .line 139
    .line 140
    invoke-interface {p2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    move-result-object p2

    .line 144
    check-cast p2, Ljava/lang/String;

    .line 145
    .line 146
    invoke-virtual {p2, p4}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 147
    .line 148
    .line 149
    move-result-object p2

    .line 150
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 151
    .line 152
    .line 153
    iget-object p4, p0, Lxf8;->f:Ljava/util/LinkedHashMap;

    .line 154
    .line 155
    invoke-static {p4, p3}, Lzp4;->H(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Object;

    .line 156
    .line 157
    .line 158
    move-result-object p3

    .line 159
    invoke-interface {p4, p2, p3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 160
    .line 161
    .line 162
    goto :goto_3

    .line 163
    :cond_4
    new-instance p1, Lsa2;

    .line 164
    .line 165
    iget-object p2, p0, Lxf8;->g:[Ljava/lang/String;

    .line 166
    .line 167
    array-length p2, p2

    .line 168
    invoke-direct {p1, p2}, Lsa2;-><init>(I)V

    .line 169
    .line 170
    .line 171
    iput-object p1, p0, Lxf8;->h:Lsa2;

    .line 172
    .line 173
    new-instance p1, Ljb1;

    .line 174
    .line 175
    iget-object p2, p0, Lxf8;->g:[Ljava/lang/String;

    .line 176
    .line 177
    array-length p2, p2

    .line 178
    invoke-direct {p1, p2}, Ljb1;-><init>(I)V

    .line 179
    .line 180
    .line 181
    iput-object p1, p0, Lxf8;->i:Ljb1;

    .line 182
    .line 183
    return-void
.end method


# virtual methods
.method public final a(Ltq5;Ls51;)Ljava/lang/Object;
    .locals 4

    .line 1
    instance-of v0, p2, Lpf8;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Lpf8;

    .line 7
    .line 8
    iget v1, v0, Lpf8;->i0:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lpf8;->i0:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lpf8;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, Lpf8;-><init>(Lxf8;Ls51;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p0, v0, Lpf8;->g0:Ljava/lang/Object;

    .line 26
    .line 27
    iget p2, v0, Lpf8;->i0:I

    .line 28
    .line 29
    const/4 v1, 0x2

    .line 30
    const/4 v2, 0x1

    .line 31
    sget-object v3, Lc71;->X:Lc71;

    .line 32
    .line 33
    if-eqz p2, :cond_3

    .line 34
    .line 35
    if-eq p2, v2, :cond_2

    .line 36
    .line 37
    if-ne p2, v1, :cond_1

    .line 38
    .line 39
    iget-object p1, v0, Lpf8;->f0:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast p1, Ljava/util/Set;

    .line 42
    .line 43
    invoke-static {p0}, Lw39;->n0(Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    return-object p1

    .line 47
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 48
    .line 49
    invoke-static {p0}, Lbt;->i(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    const/4 p0, 0x0

    .line 53
    return-object p0

    .line 54
    :cond_2
    iget-object p1, v0, Lpf8;->f0:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast p1, Ltq5;

    .line 57
    .line 58
    invoke-static {p0}, Lw39;->n0(Ljava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    goto :goto_1

    .line 62
    :cond_3
    invoke-static {p0}, Lw39;->n0(Ljava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    new-instance p0, Lb58;

    .line 66
    .line 67
    const/4 p2, 0x7

    .line 68
    invoke-direct {p0, p2}, Lb58;-><init>(B)V

    .line 69
    .line 70
    .line 71
    iput-object p1, v0, Lpf8;->f0:Ljava/lang/Object;

    .line 72
    .line 73
    iput v2, v0, Lpf8;->i0:I

    .line 74
    .line 75
    const-string p2, "SELECT * FROM room_table_modification_log WHERE invalidated = 1"

    .line 76
    .line 77
    invoke-interface {p1, p2, p0, v0}, Ltq5;->d(Ljava/lang/String;Lgn2;Ls51;)Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object p0

    .line 81
    if-ne p0, v3, :cond_4

    .line 82
    .line 83
    goto :goto_2

    .line 84
    :cond_4
    :goto_1
    check-cast p0, Ljava/util/Set;

    .line 85
    .line 86
    move-object p2, p0

    .line 87
    check-cast p2, Ljava/util/Collection;

    .line 88
    .line 89
    invoke-interface {p2}, Ljava/util/Collection;->isEmpty()Z

    .line 90
    .line 91
    .line 92
    move-result p2

    .line 93
    if-nez p2, :cond_5

    .line 94
    .line 95
    iput-object p0, v0, Lpf8;->f0:Ljava/lang/Object;

    .line 96
    .line 97
    iput v1, v0, Lpf8;->i0:I

    .line 98
    .line 99
    const-string p2, "UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1"

    .line 100
    .line 101
    invoke-static {p1, p2, v0}, Lmn7;->d(Ltq5;Ljava/lang/String;Ls51;)Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object p1

    .line 105
    if-ne p1, v3, :cond_5

    .line 106
    .line 107
    :goto_2
    return-object v3

    .line 108
    :cond_5
    return-object p0
.end method

.method public final b(Ls51;)Ljava/lang/Object;
    .locals 10

    .line 1
    instance-of v0, p1, Lrf8;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Lrf8;

    .line 7
    .line 8
    iget v1, v0, Lrf8;->j0:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lrf8;->j0:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lrf8;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, Lrf8;-><init>(Lxf8;Ls51;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, Lrf8;->h0:Ljava/lang/Object;

    .line 26
    .line 27
    iget v1, v0, Lrf8;->j0:I

    .line 28
    .line 29
    const/4 v2, 0x0

    .line 30
    const/4 v3, 0x0

    .line 31
    const/4 v4, 0x1

    .line 32
    if-eqz v1, :cond_2

    .line 33
    .line 34
    if-ne v1, v4, :cond_1

    .line 35
    .line 36
    iget-object p0, v0, Lrf8;->g0:Lmj0;

    .line 37
    .line 38
    iget-object v0, v0, Lrf8;->f0:Lxf8;

    .line 39
    .line 40
    :try_start_0
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 41
    .line 42
    .line 43
    move-object v1, p0

    .line 44
    move-object p0, v0

    .line 45
    goto :goto_1

    .line 46
    :catchall_0
    move-exception p1

    .line 47
    goto/16 :goto_8

    .line 48
    .line 49
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 50
    .line 51
    invoke-static {p0}, Lbt;->i(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    return-object v2

    .line 55
    :cond_2
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    iget-object p1, p0, Lxf8;->a:Landroidx/work/impl/WorkDatabase_Impl;

    .line 59
    .line 60
    iget-object v1, p1, Lql6;->f:Lmj0;

    .line 61
    .line 62
    invoke-virtual {v1}, Lmj0;->x()Z

    .line 63
    .line 64
    .line 65
    move-result v5

    .line 66
    sget-object v6, Lm02;->X:Lm02;

    .line 67
    .line 68
    if-eqz v5, :cond_b

    .line 69
    .line 70
    :try_start_1
    iget-object v5, p0, Lxf8;->j:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 71
    .line 72
    invoke-virtual {v5, v4, v3}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 73
    .line 74
    .line 75
    move-result v5
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 76
    if-nez v5, :cond_3

    .line 77
    .line 78
    invoke-virtual {v1}, Lmj0;->a0()V

    .line 79
    .line 80
    .line 81
    return-object v6

    .line 82
    :cond_3
    :try_start_2
    iget-object v5, p0, Lxf8;->k:Ldn2;

    .line 83
    .line 84
    invoke-interface {v5}, Ldn2;->invoke()Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object v5

    .line 88
    check-cast v5, Ljava/lang/Boolean;

    .line 89
    .line 90
    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    .line 91
    .line 92
    .line 93
    move-result v5
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 94
    if-nez v5, :cond_4

    .line 95
    .line 96
    invoke-virtual {v1}, Lmj0;->a0()V

    .line 97
    .line 98
    .line 99
    return-object v6

    .line 100
    :cond_4
    :try_start_3
    new-instance v5, Lsf8;

    .line 101
    .line 102
    invoke-direct {v5, p0, v2, v3}, Lsf8;-><init>(Lxf8;Lq51;B)V

    .line 103
    .line 104
    .line 105
    iput-object p0, v0, Lrf8;->f0:Lxf8;

    .line 106
    .line 107
    iput-object v1, v0, Lrf8;->g0:Lmj0;

    .line 108
    .line 109
    iput v4, v0, Lrf8;->j0:I

    .line 110
    .line 111
    invoke-virtual {p1, v3, v5, v0}, Lql6;->q(ZLrn2;Ls51;)Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 115
    sget-object v0, Lc71;->X:Lc71;

    .line 116
    .line 117
    if-ne p1, v0, :cond_5

    .line 118
    .line 119
    return-object v0

    .line 120
    :cond_5
    :goto_1
    :try_start_4
    check-cast p1, Ljava/util/Set;

    .line 121
    .line 122
    move-object v0, p1

    .line 123
    check-cast v0, Ljava/util/Collection;

    .line 124
    .line 125
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 126
    .line 127
    .line 128
    move-result v0

    .line 129
    if-nez v0, :cond_a

    .line 130
    .line 131
    iget-object v0, p0, Lxf8;->i:Ljb1;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 132
    .line 133
    :try_start_5
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 134
    .line 135
    .line 136
    invoke-interface {p1}, Ljava/util/Set;->isEmpty()Z

    .line 137
    .line 138
    .line 139
    move-result v2

    .line 140
    if-eqz v2, :cond_6

    .line 141
    .line 142
    goto :goto_4

    .line 143
    :cond_6
    iget-object v0, v0, Ljb1;->a:Loh7;

    .line 144
    .line 145
    :cond_7
    invoke-virtual {v0}, Loh7;->getValue()Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    move-result-object v2

    .line 149
    move-object v5, v2

    .line 150
    check-cast v5, [I

    .line 151
    .line 152
    array-length v6, v5

    .line 153
    new-array v7, v6, [I

    .line 154
    .line 155
    move v8, v3

    .line 156
    :goto_2
    if-ge v8, v6, :cond_9

    .line 157
    .line 158
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 159
    .line 160
    .line 161
    move-result-object v9

    .line 162
    invoke-interface {p1, v9}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 163
    .line 164
    .line 165
    move-result v9

    .line 166
    if-eqz v9, :cond_8

    .line 167
    .line 168
    aget v9, v5, v8

    .line 169
    .line 170
    add-int/2addr v9, v4

    .line 171
    goto :goto_3

    .line 172
    :cond_8
    aget v9, v5, v8

    .line 173
    .line 174
    :goto_3
    aput v9, v7, v8

    .line 175
    .line 176
    add-int/lit8 v8, v8, 0x1

    .line 177
    .line 178
    goto :goto_2

    .line 179
    :cond_9
    invoke-virtual {v0, v2, v7}, Loh7;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 180
    .line 181
    .line 182
    move-result v2
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 183
    if-eqz v2, :cond_7

    .line 184
    .line 185
    :goto_4
    :try_start_6
    iget-object p0, p0, Lxf8;->e:Ld0;

    .line 186
    .line 187
    invoke-virtual {p0, p1}, Ld0;->B(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 188
    .line 189
    .line 190
    goto :goto_7

    .line 191
    :catchall_1
    move-exception p1

    .line 192
    :goto_5
    move-object p0, v1

    .line 193
    goto :goto_8

    .line 194
    :goto_6
    move-object p1, p0

    .line 195
    goto :goto_5

    .line 196
    :catchall_2
    move-exception p0

    .line 197
    goto :goto_6

    .line 198
    :cond_a
    :goto_7
    invoke-virtual {v1}, Lmj0;->a0()V

    .line 199
    .line 200
    .line 201
    return-object p1

    .line 202
    :goto_8
    invoke-virtual {p0}, Lmj0;->a0()V

    .line 203
    .line 204
    .line 205
    throw p1

    .line 206
    :cond_b
    return-object v6
.end method

.method public final c(Ldn2;Ldn2;)V
    .locals 4

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    const/4 v1, 0x1

    .line 9
    iget-object v2, p0, Lxf8;->j:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 10
    .line 11
    invoke-virtual {v2, v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    invoke-interface {p1}, Ldn2;->invoke()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    iget-object p1, p0, Lxf8;->a:Landroidx/work/impl/WorkDatabase_Impl;

    .line 21
    .line 22
    iget-object p1, p1, Lql6;->a:Lm51;

    .line 23
    .line 24
    const/4 v0, 0x0

    .line 25
    if-eqz p1, :cond_0

    .line 26
    .line 27
    new-instance v1, Lx61;

    .line 28
    .line 29
    const-string v2, "Room Invalidation Tracker Refresh"

    .line 30
    .line 31
    invoke-direct {v1, v2}, Lx61;-><init>(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    new-instance v2, Lt17;

    .line 35
    .line 36
    const/16 v3, 0x10

    .line 37
    .line 38
    invoke-direct {v2, p0, p2, v0, v3}, Lt17;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq51;B)V

    .line 39
    .line 40
    .line 41
    const/4 p0, 0x2

    .line 42
    invoke-static {p1, v1, v0, v2, p0}, Lw51;->G(Lb71;Ls61;Le71;Lrn2;I)Log7;

    .line 43
    .line 44
    .line 45
    return-void

    .line 46
    :cond_0
    const-string p0, "coroutineScope"

    .line 47
    .line 48
    invoke-static {p0}, Ldh3;->T(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    throw v0

    .line 52
    :cond_1
    return-void
.end method

.method public final d(Led8;ILs51;)Ljava/lang/Object;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move/from16 v2, p2

    .line 6
    .line 7
    move-object/from16 v3, p3

    .line 8
    .line 9
    instance-of v4, v3, Ltf8;

    .line 10
    .line 11
    if-eqz v4, :cond_0

    .line 12
    .line 13
    move-object v4, v3

    .line 14
    check-cast v4, Ltf8;

    .line 15
    .line 16
    iget v5, v4, Ltf8;->o0:I

    .line 17
    .line 18
    const/high16 v6, -0x80000000

    .line 19
    .line 20
    and-int v7, v5, v6

    .line 21
    .line 22
    if-eqz v7, :cond_0

    .line 23
    .line 24
    sub-int/2addr v5, v6

    .line 25
    iput v5, v4, Ltf8;->o0:I

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    new-instance v4, Ltf8;

    .line 29
    .line 30
    invoke-direct {v4, v0, v3}, Ltf8;-><init>(Lxf8;Ls51;)V

    .line 31
    .line 32
    .line 33
    :goto_0
    iget-object v3, v4, Ltf8;->m0:Ljava/lang/Object;

    .line 34
    .line 35
    iget v5, v4, Ltf8;->o0:I

    .line 36
    .line 37
    const/4 v6, 0x2

    .line 38
    const/4 v7, 0x1

    .line 39
    sget-object v8, Lc71;->X:Lc71;

    .line 40
    .line 41
    if-eqz v5, :cond_3

    .line 42
    .line 43
    if-eq v5, v7, :cond_2

    .line 44
    .line 45
    if-ne v5, v6, :cond_1

    .line 46
    .line 47
    iget v0, v4, Ltf8;->l0:I

    .line 48
    .line 49
    iget v1, v4, Ltf8;->k0:I

    .line 50
    .line 51
    iget v2, v4, Ltf8;->j0:I

    .line 52
    .line 53
    iget-object v5, v4, Ltf8;->i0:[Ljava/lang/String;

    .line 54
    .line 55
    iget-object v9, v4, Ltf8;->h0:Ljava/lang/String;

    .line 56
    .line 57
    iget-object v10, v4, Ltf8;->g0:Ltq5;

    .line 58
    .line 59
    iget-object v11, v4, Ltf8;->f0:Lxf8;

    .line 60
    .line 61
    invoke-static {v3}, Lw39;->n0(Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    move/from16 p3, v7

    .line 65
    .line 66
    goto/16 :goto_5

    .line 67
    .line 68
    :cond_1
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 69
    .line 70
    invoke-static {v0}, Lbt;->i(Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    const/4 v0, 0x0

    .line 74
    return-object v0

    .line 75
    :cond_2
    iget v0, v4, Ltf8;->j0:I

    .line 76
    .line 77
    iget-object v1, v4, Ltf8;->g0:Ltq5;

    .line 78
    .line 79
    iget-object v2, v4, Ltf8;->f0:Lxf8;

    .line 80
    .line 81
    invoke-static {v3}, Lw39;->n0(Ljava/lang/Object;)V

    .line 82
    .line 83
    .line 84
    move-object/from16 v16, v2

    .line 85
    .line 86
    move v2, v0

    .line 87
    move-object/from16 v0, v16

    .line 88
    .line 89
    goto :goto_1

    .line 90
    :cond_3
    invoke-static {v3}, Lw39;->n0(Ljava/lang/Object;)V

    .line 91
    .line 92
    .line 93
    new-instance v3, Ljava/lang/StringBuilder;

    .line 94
    .line 95
    const-string v5, "INSERT OR IGNORE INTO room_table_modification_log VALUES("

    .line 96
    .line 97
    invoke-direct {v3, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 98
    .line 99
    .line 100
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 101
    .line 102
    .line 103
    const-string v5, ", 0)"

    .line 104
    .line 105
    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 106
    .line 107
    .line 108
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object v3

    .line 112
    iput-object v0, v4, Ltf8;->f0:Lxf8;

    .line 113
    .line 114
    iput-object v1, v4, Ltf8;->g0:Ltq5;

    .line 115
    .line 116
    iput v2, v4, Ltf8;->j0:I

    .line 117
    .line 118
    iput v7, v4, Ltf8;->o0:I

    .line 119
    .line 120
    invoke-static {v1, v3, v4}, Lmn7;->d(Ltq5;Ljava/lang/String;Ls51;)Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    move-result-object v3

    .line 124
    if-ne v3, v8, :cond_4

    .line 125
    .line 126
    goto :goto_4

    .line 127
    :cond_4
    :goto_1
    iget-object v3, v0, Lxf8;->g:[Ljava/lang/String;

    .line 128
    .line 129
    aget-object v3, v3, v2

    .line 130
    .line 131
    sget-object v5, Lxf8;->l:[Ljava/lang/String;

    .line 132
    .line 133
    const/4 v9, 0x0

    .line 134
    const/4 v10, 0x3

    .line 135
    move-object v11, v0

    .line 136
    move v0, v10

    .line 137
    move-object v10, v1

    .line 138
    move v1, v9

    .line 139
    move-object v9, v3

    .line 140
    :goto_2
    if-ge v1, v0, :cond_7

    .line 141
    .line 142
    aget-object v3, v5, v1

    .line 143
    .line 144
    iget-boolean v12, v11, Lxf8;->d:Z

    .line 145
    .line 146
    if-eqz v12, :cond_5

    .line 147
    .line 148
    const-string v12, "TEMP"

    .line 149
    .line 150
    goto :goto_3

    .line 151
    :cond_5
    const-string v12, ""

    .line 152
    .line 153
    :goto_3
    new-instance v13, Ljava/lang/StringBuilder;

    .line 154
    .line 155
    const-string v14, "room_table_modification_trigger_"

    .line 156
    .line 157
    invoke-direct {v13, v14}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 158
    .line 159
    .line 160
    invoke-virtual {v13, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 161
    .line 162
    .line 163
    const/16 v14, 0x5f

    .line 164
    .line 165
    invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 166
    .line 167
    .line 168
    invoke-virtual {v13, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 169
    .line 170
    .line 171
    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 172
    .line 173
    .line 174
    move-result-object v13

    .line 175
    const-string v14, " TRIGGER IF NOT EXISTS `"

    .line 176
    .line 177
    const-string v15, "` AFTER "

    .line 178
    .line 179
    move/from16 p3, v7

    .line 180
    .line 181
    const-string v7, "CREATE "

    .line 182
    .line 183
    invoke-static {v7, v12, v14, v13, v15}, Loi0;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 184
    .line 185
    .line 186
    move-result-object v7

    .line 187
    const-string v12, " ON `"

    .line 188
    .line 189
    const-string v13, "` BEGIN UPDATE room_table_modification_log SET invalidated = 1 WHERE table_id = "

    .line 190
    .line 191
    invoke-static {v7, v3, v12, v9, v13}, Loi0;->y(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 192
    .line 193
    .line 194
    const-string v3, " AND invalidated = 0; END"

    .line 195
    .line 196
    invoke-static {v7, v2, v3}, Loi0;->n(Ljava/lang/StringBuilder;ILjava/lang/String;)Ljava/lang/String;

    .line 197
    .line 198
    .line 199
    move-result-object v3

    .line 200
    iput-object v11, v4, Ltf8;->f0:Lxf8;

    .line 201
    .line 202
    iput-object v10, v4, Ltf8;->g0:Ltq5;

    .line 203
    .line 204
    iput-object v9, v4, Ltf8;->h0:Ljava/lang/String;

    .line 205
    .line 206
    iput-object v5, v4, Ltf8;->i0:[Ljava/lang/String;

    .line 207
    .line 208
    iput v2, v4, Ltf8;->j0:I

    .line 209
    .line 210
    iput v1, v4, Ltf8;->k0:I

    .line 211
    .line 212
    iput v0, v4, Ltf8;->l0:I

    .line 213
    .line 214
    iput v6, v4, Ltf8;->o0:I

    .line 215
    .line 216
    invoke-static {v10, v3, v4}, Lmn7;->d(Ltq5;Ljava/lang/String;Ls51;)Ljava/lang/Object;

    .line 217
    .line 218
    .line 219
    move-result-object v3

    .line 220
    if-ne v3, v8, :cond_6

    .line 221
    .line 222
    :goto_4
    return-object v8

    .line 223
    :cond_6
    :goto_5
    add-int/lit8 v1, v1, 0x1

    .line 224
    .line 225
    move/from16 v7, p3

    .line 226
    .line 227
    goto :goto_2

    .line 228
    :cond_7
    sget-object v0, Ldn8;->a:Ldn8;

    .line 229
    .line 230
    return-object v0
.end method

.method public final e(Led8;ILs51;)Ljava/lang/Object;
    .locals 7

    .line 1
    instance-of v0, p3, Luf8;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, Luf8;

    .line 7
    .line 8
    iget v1, v0, Luf8;->m0:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Luf8;->m0:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Luf8;

    .line 21
    .line 22
    invoke-direct {v0, p0, p3}, Luf8;-><init>(Lxf8;Ls51;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p3, v0, Luf8;->k0:Ljava/lang/Object;

    .line 26
    .line 27
    iget v1, v0, Luf8;->m0:I

    .line 28
    .line 29
    const/4 v2, 0x1

    .line 30
    if-eqz v1, :cond_2

    .line 31
    .line 32
    if-ne v1, v2, :cond_1

    .line 33
    .line 34
    iget p0, v0, Luf8;->j0:I

    .line 35
    .line 36
    iget p1, v0, Luf8;->i0:I

    .line 37
    .line 38
    iget-object p2, v0, Luf8;->h0:[Ljava/lang/String;

    .line 39
    .line 40
    iget-object v1, v0, Luf8;->g0:Ljava/lang/String;

    .line 41
    .line 42
    iget-object v3, v0, Luf8;->f0:Ltq5;

    .line 43
    .line 44
    invoke-static {p3}, Lw39;->n0(Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    move-object p3, p2

    .line 48
    move-object p2, v3

    .line 49
    goto :goto_2

    .line 50
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 51
    .line 52
    invoke-static {p0}, Lbt;->i(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    const/4 p0, 0x0

    .line 56
    return-object p0

    .line 57
    :cond_2
    invoke-static {p3}, Lw39;->n0(Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    iget-object p0, p0, Lxf8;->g:[Ljava/lang/String;

    .line 61
    .line 62
    aget-object p0, p0, p2

    .line 63
    .line 64
    sget-object p2, Lxf8;->l:[Ljava/lang/String;

    .line 65
    .line 66
    const/4 p3, 0x0

    .line 67
    const/4 v1, 0x3

    .line 68
    move v6, v1

    .line 69
    move-object v1, p0

    .line 70
    move p0, v6

    .line 71
    move-object v6, p2

    .line 72
    move-object p2, p1

    .line 73
    move p1, p3

    .line 74
    move-object p3, v6

    .line 75
    :goto_1
    if-ge p1, p0, :cond_4

    .line 76
    .line 77
    aget-object v3, p3, p1

    .line 78
    .line 79
    new-instance v4, Ljava/lang/StringBuilder;

    .line 80
    .line 81
    const-string v5, "room_table_modification_trigger_"

    .line 82
    .line 83
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 87
    .line 88
    .line 89
    const/16 v5, 0x5f

    .line 90
    .line 91
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 92
    .line 93
    .line 94
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 95
    .line 96
    .line 97
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object v3

    .line 101
    const-string v4, "DROP TRIGGER IF EXISTS `"

    .line 102
    .line 103
    const/16 v5, 0x60

    .line 104
    .line 105
    invoke-static {v5, v4, v3}, Lp61;->l(CLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object v3

    .line 109
    iput-object p2, v0, Luf8;->f0:Ltq5;

    .line 110
    .line 111
    iput-object v1, v0, Luf8;->g0:Ljava/lang/String;

    .line 112
    .line 113
    iput-object p3, v0, Luf8;->h0:[Ljava/lang/String;

    .line 114
    .line 115
    iput p1, v0, Luf8;->i0:I

    .line 116
    .line 117
    iput p0, v0, Luf8;->j0:I

    .line 118
    .line 119
    iput v2, v0, Luf8;->m0:I

    .line 120
    .line 121
    invoke-static {p2, v3, v0}, Lmn7;->d(Ltq5;Ljava/lang/String;Ls51;)Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object v3

    .line 125
    sget-object v4, Lc71;->X:Lc71;

    .line 126
    .line 127
    if-ne v3, v4, :cond_3

    .line 128
    .line 129
    return-object v4

    .line 130
    :cond_3
    :goto_2
    add-int/2addr p1, v2

    .line 131
    goto :goto_1

    .line 132
    :cond_4
    sget-object p0, Ldn8;->a:Ldn8;

    .line 133
    .line 134
    return-object p0
.end method

.method public final f(Ls51;)Ljava/lang/Object;
    .locals 5

    .line 1
    instance-of v0, p1, Lvf8;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Lvf8;

    .line 7
    .line 8
    iget v1, v0, Lvf8;->i0:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lvf8;->i0:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lvf8;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, Lvf8;-><init>(Lxf8;Ls51;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, Lvf8;->g0:Ljava/lang/Object;

    .line 26
    .line 27
    iget v1, v0, Lvf8;->i0:I

    .line 28
    .line 29
    const/4 v2, 0x0

    .line 30
    const/4 v3, 0x1

    .line 31
    if-eqz v1, :cond_2

    .line 32
    .line 33
    if-ne v1, v3, :cond_1

    .line 34
    .line 35
    iget-object p0, v0, Lvf8;->f0:Lmj0;

    .line 36
    .line 37
    :try_start_0
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 38
    .line 39
    .line 40
    goto :goto_1

    .line 41
    :catchall_0
    move-exception p1

    .line 42
    goto :goto_2

    .line 43
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 44
    .line 45
    invoke-static {p0}, Lbt;->i(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    return-object v2

    .line 49
    :cond_2
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    iget-object p1, p0, Lxf8;->a:Landroidx/work/impl/WorkDatabase_Impl;

    .line 53
    .line 54
    iget-object v1, p1, Lql6;->f:Lmj0;

    .line 55
    .line 56
    invoke-virtual {v1}, Lmj0;->x()Z

    .line 57
    .line 58
    .line 59
    move-result v4

    .line 60
    if-eqz v4, :cond_4

    .line 61
    .line 62
    :try_start_1
    new-instance v4, Lsf8;

    .line 63
    .line 64
    invoke-direct {v4, p0, v2, v3}, Lsf8;-><init>(Lxf8;Lq51;B)V

    .line 65
    .line 66
    .line 67
    iput-object v1, v0, Lvf8;->f0:Lmj0;

    .line 68
    .line 69
    iput v3, v0, Lvf8;->i0:I

    .line 70
    .line 71
    const/4 p0, 0x0

    .line 72
    invoke-virtual {p1, p0, v4, v0}, Lql6;->q(ZLrn2;Ls51;)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 76
    sget-object p1, Lc71;->X:Lc71;

    .line 77
    .line 78
    if-ne p0, p1, :cond_3

    .line 79
    .line 80
    return-object p1

    .line 81
    :cond_3
    move-object p0, v1

    .line 82
    :goto_1
    invoke-virtual {p0}, Lmj0;->a0()V

    .line 83
    .line 84
    .line 85
    goto :goto_3

    .line 86
    :catchall_1
    move-exception p1

    .line 87
    move-object p0, v1

    .line 88
    :goto_2
    invoke-virtual {p0}, Lmj0;->a0()V

    .line 89
    .line 90
    .line 91
    throw p1

    .line 92
    :cond_4
    :goto_3
    sget-object p0, Ldn8;->a:Ldn8;

    .line 93
    .line 94
    return-object p0
.end method
