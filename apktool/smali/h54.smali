.class public final Lh54;
.super Li54;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# static fields
.field public static final synthetic p:I


# instance fields
.field public final n:Lta6;

.field public final o:Lp44;


# direct methods
.method public constructor <init>(Lz47;Lta6;Lp44;)V
    .locals 1

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    invoke-direct {p0, p1, v0}, Lf54;-><init>(Lz47;Lt44;)V

    .line 6
    .line 7
    .line 8
    iput-object p2, p0, Lh54;->n:Lta6;

    .line 9
    .line 10
    iput-object p3, p0, Lh54;->o:Lp44;

    .line 11
    .line 12
    return-void
.end method

.method public static v(Lfx5;)Lfx5;
    .locals 2

    .line 1
    invoke-interface {p0}, Lld0;->r()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x2

    .line 6
    if-eq v0, v1, :cond_0

    .line 7
    .line 8
    return-object p0

    .line 9
    :cond_0
    invoke-interface {p0}, Lld0;->q()Ljava/util/Collection;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    check-cast p0, Ljava/lang/Iterable;

    .line 17
    .line 18
    new-instance v0, Ljava/util/ArrayList;

    .line 19
    .line 20
    const/16 v1, 0xa

    .line 21
    .line 22
    invoke-static {p0, v1}, Lxv0;->Z(Ljava/lang/Iterable;I)I

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 27
    .line 28
    .line 29
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    if-eqz v1, :cond_1

    .line 38
    .line 39
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    check-cast v1, Lfx5;

    .line 44
    .line 45
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 46
    .line 47
    .line 48
    invoke-static {v1}, Lh54;->v(Lfx5;)Lfx5;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 53
    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_1
    invoke-static {v0}, Lwv0;->b1(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    invoke-static {p0}, Lwv0;->Y0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    invoke-static {p0}, Lwv0;->O0(Ljava/util/List;)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object p0

    .line 68
    check-cast p0, Lfx5;

    .line 69
    .line 70
    return-object p0
.end method


# virtual methods
.method public final e(Lv15;Lx45;)Lot0;
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    const/4 p0, 0x0

    .line 8
    return-object p0
.end method

.method public final i(Lpk1;Lgn2;)Ljava/util/Set;
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p1, p0, Lf54;->e:Lte4;

    .line 5
    .line 6
    invoke-virtual {p1}, Lte4;->invoke()Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    check-cast p1, Lld1;

    .line 11
    .line 12
    invoke-interface {p1}, Lld1;->a()Ljava/util/Set;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    check-cast p1, Ljava/lang/Iterable;

    .line 17
    .line 18
    invoke-static {p1}, Lwv0;->b1(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    iget-object p2, p0, Lh54;->o:Lp44;

    .line 23
    .line 24
    invoke-static {p2}, Lxt7;->c(Lsx4;)Lh54;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    if-eqz v0, :cond_0

    .line 29
    .line 30
    invoke-virtual {v0}, Lf54;->c()Ljava/util/Set;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    goto :goto_0

    .line 35
    :cond_0
    const/4 v0, 0x0

    .line 36
    :goto_0
    if-nez v0, :cond_1

    .line 37
    .line 38
    sget-object v0, Lm02;->X:Lm02;

    .line 39
    .line 40
    :cond_1
    check-cast v0, Ljava/util/Collection;

    .line 41
    .line 42
    invoke-interface {p1, v0}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    .line 43
    .line 44
    .line 45
    iget-object v0, p0, Lh54;->n:Lta6;

    .line 46
    .line 47
    iget-object v0, v0, Lta6;->a:Ljava/lang/Class;

    .line 48
    .line 49
    invoke-virtual {v0}, Ljava/lang/Class;->isEnum()Z

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    if-eqz v0, :cond_2

    .line 54
    .line 55
    sget-object v0, Lug7;->c:Lv15;

    .line 56
    .line 57
    sget-object v1, Lug7;->a:Lv15;

    .line 58
    .line 59
    filled-new-array {v0, v1}, [Lv15;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    invoke-static {v0}, Li21;->L([Ljava/lang/Object;)Ljava/util/List;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    invoke-interface {p1, v0}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    .line 68
    .line 69
    .line 70
    :cond_2
    iget-object p0, p0, Lf54;->b:Lz47;

    .line 71
    .line 72
    iget-object v0, p0, Lz47;->Y:Ljava/lang/Object;

    .line 73
    .line 74
    check-cast v0, Lc6;

    .line 75
    .line 76
    iget-object v0, v0, Lc6;->r0:Ljava/lang/Object;

    .line 77
    .line 78
    check-cast v0, La08;

    .line 79
    .line 80
    check-cast v0, Lra;

    .line 81
    .line 82
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 83
    .line 84
    .line 85
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 86
    .line 87
    .line 88
    new-instance p0, Ljava/util/ArrayList;

    .line 89
    .line 90
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 91
    .line 92
    .line 93
    invoke-interface {p1, p0}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    .line 94
    .line 95
    .line 96
    return-object p1
.end method

.method public final j(Lv15;Ljava/util/ArrayList;)V
    .locals 0

    .line 1
    iget-object p1, p0, Lf54;->b:Lz47;

    .line 2
    .line 3
    iget-object p2, p1, Lz47;->Y:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast p2, Lc6;

    .line 6
    .line 7
    iget-object p2, p2, Lc6;->r0:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast p2, La08;

    .line 10
    .line 11
    check-cast p2, Lra;

    .line 12
    .line 13
    iget-object p0, p0, Lh54;->o:Lp44;

    .line 14
    .line 15
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method public final k()Lld1;
    .locals 2

    .line 1
    new-instance v0, Ljs0;

    .line 2
    .line 3
    iget-object p0, p0, Lh54;->n:Lta6;

    .line 4
    .line 5
    sget-object v1, Lcl1;->C0:Lcl1;

    .line 6
    .line 7
    invoke-direct {v0, p0, v1}, Ljs0;-><init>(Lta6;Lgn2;)V

    .line 8
    .line 9
    .line 10
    return-object v0
.end method

.method public final m(Ljava/util/LinkedHashSet;Lv15;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lh54;->o:Lp44;

    .line 2
    .line 3
    invoke-static {v0}, Lxt7;->c(Lsx4;)Lh54;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    sget-object v1, Lm02;->X:Lm02;

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    sget-object v2, Lx45;->g0:Lx45;

    .line 13
    .line 14
    invoke-virtual {v1, p2, v2}, Lf54;->b(Lv15;Lx45;)Ljava/util/Collection;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    check-cast v1, Ljava/lang/Iterable;

    .line 19
    .line 20
    invoke-static {v1}, Lwv0;->c1(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    :goto_0
    check-cast v1, Ljava/util/Collection;

    .line 25
    .line 26
    iget-object v2, p0, Lf54;->b:Lz47;

    .line 27
    .line 28
    iget-object v2, v2, Lz47;->Y:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast v2, Lc6;

    .line 31
    .line 32
    iget-object v2, v2, Lc6;->Z:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast v2, Lp45;

    .line 35
    .line 36
    check-cast v2, Lq45;

    .line 37
    .line 38
    iget-object v2, v2, Lq45;->d:Lhf5;

    .line 39
    .line 40
    invoke-static {p2, v1, p1, v0, v2}, Lch3;->R(Lv15;Ljava/util/Collection;Ljava/util/AbstractCollection;Lsx4;Lhf5;)Ljava/util/LinkedHashSet;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    invoke-interface {p1, v1}, Ljava/util/Collection;->addAll(Ljava/util/Collection;)Z

    .line 45
    .line 46
    .line 47
    iget-object p0, p0, Lh54;->n:Lta6;

    .line 48
    .line 49
    iget-object p0, p0, Lta6;->a:Ljava/lang/Class;

    .line 50
    .line 51
    invoke-virtual {p0}, Ljava/lang/Class;->isEnum()Z

    .line 52
    .line 53
    .line 54
    move-result p0

    .line 55
    if-eqz p0, :cond_2

    .line 56
    .line 57
    sget-object p0, Lug7;->c:Lv15;

    .line 58
    .line 59
    invoke-virtual {p2, p0}, Lv15;->equals(Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    move-result p0

    .line 63
    if-eqz p0, :cond_1

    .line 64
    .line 65
    invoke-static {v0}, Lz91;->v(Lsx4;)Lq97;

    .line 66
    .line 67
    .line 68
    move-result-object p0

    .line 69
    invoke-interface {p1, p0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 70
    .line 71
    .line 72
    return-void

    .line 73
    :cond_1
    sget-object p0, Lug7;->a:Lv15;

    .line 74
    .line 75
    invoke-virtual {p2, p0}, Lv15;->equals(Ljava/lang/Object;)Z

    .line 76
    .line 77
    .line 78
    move-result p0

    .line 79
    if-eqz p0, :cond_2

    .line 80
    .line 81
    invoke-static {v0}, Lz91;->w(Lsx4;)Lq97;

    .line 82
    .line 83
    .line 84
    move-result-object p0

    .line 85
    invoke-interface {p1, p0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 86
    .line 87
    .line 88
    :cond_2
    return-void
.end method

.method public final n(Lv15;Ljava/util/ArrayList;)V
    .locals 7

    .line 1
    new-instance v0, Ljava/util/LinkedHashSet;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v1, Lf0;

    .line 7
    .line 8
    const/16 v2, 0x15

    .line 9
    .line 10
    invoke-direct {v1, p1, v2}, Lf0;-><init>(Ljava/lang/Object;B)V

    .line 11
    .line 12
    .line 13
    iget-object v2, p0, Lh54;->o:Lp44;

    .line 14
    .line 15
    invoke-static {v2}, Li21;->K(Ljava/lang/Object;)Ljava/util/List;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    sget-object v4, Loy1;->H0:Loy1;

    .line 20
    .line 21
    new-instance v5, Lg54;

    .line 22
    .line 23
    invoke-direct {v5, v2, v0, v1}, Lg54;-><init>(Lsx4;Ljava/util/Set;Lgn2;)V

    .line 24
    .line 25
    .line 26
    invoke-static {v3, v4, v5}, Ljb5;->p(Ljava/util/List;Ld91;Lw45;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    invoke-virtual {p2}, Ljava/util/ArrayList;->isEmpty()Z

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    iget-object v3, p0, Lf54;->b:Lz47;

    .line 34
    .line 35
    if-nez v1, :cond_0

    .line 36
    .line 37
    iget-object v1, v3, Lz47;->Y:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast v1, Lc6;

    .line 40
    .line 41
    iget-object v1, v1, Lc6;->Z:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast v1, Lp45;

    .line 44
    .line 45
    check-cast v1, Lq45;

    .line 46
    .line 47
    iget-object v1, v1, Lq45;->d:Lhf5;

    .line 48
    .line 49
    invoke-static {p1, v0, p2, v2, v1}, Lch3;->R(Lv15;Ljava/util/Collection;Ljava/util/AbstractCollection;Lsx4;Lhf5;)Ljava/util/LinkedHashSet;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    invoke-virtual {p2, v0}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 54
    .line 55
    .line 56
    goto :goto_2

    .line 57
    :cond_0
    new-instance v1, Ljava/util/LinkedHashMap;

    .line 58
    .line 59
    invoke-direct {v1}, Ljava/util/LinkedHashMap;-><init>()V

    .line 60
    .line 61
    .line 62
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 67
    .line 68
    .line 69
    move-result v4

    .line 70
    if-eqz v4, :cond_2

    .line 71
    .line 72
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v4

    .line 76
    move-object v5, v4

    .line 77
    check-cast v5, Lfx5;

    .line 78
    .line 79
    invoke-static {v5}, Lh54;->v(Lfx5;)Lfx5;

    .line 80
    .line 81
    .line 82
    move-result-object v5

    .line 83
    invoke-virtual {v1, v5}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object v6

    .line 87
    if-nez v6, :cond_1

    .line 88
    .line 89
    new-instance v6, Ljava/util/ArrayList;

    .line 90
    .line 91
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 92
    .line 93
    .line 94
    invoke-interface {v1, v5, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    :cond_1
    check-cast v6, Ljava/util/List;

    .line 98
    .line 99
    invoke-interface {v6, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 100
    .line 101
    .line 102
    goto :goto_0

    .line 103
    :cond_2
    new-instance v0, Ljava/util/ArrayList;

    .line 104
    .line 105
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 106
    .line 107
    .line 108
    invoke-virtual {v1}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    .line 109
    .line 110
    .line 111
    move-result-object v1

    .line 112
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 113
    .line 114
    .line 115
    move-result-object v1

    .line 116
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 117
    .line 118
    .line 119
    move-result v4

    .line 120
    if-eqz v4, :cond_3

    .line 121
    .line 122
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object v4

    .line 126
    check-cast v4, Ljava/util/Map$Entry;

    .line 127
    .line 128
    invoke-interface {v4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    move-result-object v4

    .line 132
    check-cast v4, Ljava/util/Collection;

    .line 133
    .line 134
    iget-object v5, v3, Lz47;->Y:Ljava/lang/Object;

    .line 135
    .line 136
    check-cast v5, Lc6;

    .line 137
    .line 138
    iget-object v5, v5, Lc6;->Z:Ljava/lang/Object;

    .line 139
    .line 140
    check-cast v5, Lp45;

    .line 141
    .line 142
    check-cast v5, Lq45;

    .line 143
    .line 144
    iget-object v5, v5, Lq45;->d:Lhf5;

    .line 145
    .line 146
    invoke-static {p1, v4, p2, v2, v5}, Lch3;->R(Lv15;Ljava/util/Collection;Ljava/util/AbstractCollection;Lsx4;Lhf5;)Ljava/util/LinkedHashSet;

    .line 147
    .line 148
    .line 149
    move-result-object v4

    .line 150
    invoke-static {v0, v4}, Lbw0;->d0(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 151
    .line 152
    .line 153
    goto :goto_1

    .line 154
    :cond_3
    invoke-virtual {p2, v0}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 155
    .line 156
    .line 157
    :goto_2
    iget-object p0, p0, Lh54;->n:Lta6;

    .line 158
    .line 159
    iget-object p0, p0, Lta6;->a:Ljava/lang/Class;

    .line 160
    .line 161
    invoke-virtual {p0}, Ljava/lang/Class;->isEnum()Z

    .line 162
    .line 163
    .line 164
    move-result p0

    .line 165
    if-eqz p0, :cond_4

    .line 166
    .line 167
    sget-object p0, Lug7;->b:Lv15;

    .line 168
    .line 169
    invoke-virtual {p1, p0}, Lv15;->equals(Ljava/lang/Object;)Z

    .line 170
    .line 171
    .line 172
    move-result p0

    .line 173
    if-eqz p0, :cond_4

    .line 174
    .line 175
    invoke-static {v2}, Lz91;->u(Lsx4;)Lgx5;

    .line 176
    .line 177
    .line 178
    move-result-object p0

    .line 179
    if-eqz p0, :cond_4

    .line 180
    .line 181
    invoke-virtual {p2, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 182
    .line 183
    .line 184
    :cond_4
    return-void
.end method

.method public final o(Lpk1;)Ljava/util/Set;
    .locals 5

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p1, p0, Lf54;->e:Lte4;

    .line 5
    .line 6
    invoke-virtual {p1}, Lte4;->invoke()Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    check-cast p1, Lld1;

    .line 11
    .line 12
    invoke-interface {p1}, Lld1;->f()Ljava/util/Set;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    check-cast p1, Ljava/lang/Iterable;

    .line 17
    .line 18
    invoke-static {p1}, Lwv0;->b1(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    sget-object v0, Lcl1;->D0:Lcl1;

    .line 23
    .line 24
    iget-object v1, p0, Lh54;->o:Lp44;

    .line 25
    .line 26
    invoke-static {v1}, Li21;->K(Ljava/lang/Object;)Ljava/util/List;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    sget-object v3, Loy1;->H0:Loy1;

    .line 31
    .line 32
    new-instance v4, Lg54;

    .line 33
    .line 34
    invoke-direct {v4, v1, p1, v0}, Lg54;-><init>(Lsx4;Ljava/util/Set;Lgn2;)V

    .line 35
    .line 36
    .line 37
    invoke-static {v2, v3, v4}, Ljb5;->p(Ljava/util/List;Ld91;Lw45;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    iget-object p0, p0, Lh54;->n:Lta6;

    .line 41
    .line 42
    iget-object p0, p0, Lta6;->a:Ljava/lang/Class;

    .line 43
    .line 44
    invoke-virtual {p0}, Ljava/lang/Class;->isEnum()Z

    .line 45
    .line 46
    .line 47
    move-result p0

    .line 48
    if-eqz p0, :cond_0

    .line 49
    .line 50
    sget-object p0, Lug7;->b:Lv15;

    .line 51
    .line 52
    invoke-interface {p1, p0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 53
    .line 54
    .line 55
    :cond_0
    return-object p1
.end method

.method public final q()Led1;
    .locals 0

    .line 1
    iget-object p0, p0, Lh54;->o:Lp44;

    .line 2
    .line 3
    return-object p0
.end method
