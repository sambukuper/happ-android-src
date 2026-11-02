.class public final Lt44;
.super Lf54;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# static fields
.field public static final synthetic v:I


# instance fields
.field public final n:Lsx4;

.field public final o:Lta6;

.field public final p:Z

.field public final q:Lte4;

.field public final r:Lte4;

.field public final s:Lte4;

.field public final t:Lte4;

.field public final u:Lvt1;


# direct methods
.method public constructor <init>(Lz47;Lsx4;Lta6;ZLt44;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0, p1, p5}, Lf54;-><init>(Lz47;Lt44;)V

    .line 8
    .line 9
    .line 10
    iput-object p2, p0, Lt44;->n:Lsx4;

    .line 11
    .line 12
    iput-object p3, p0, Lt44;->o:Lta6;

    .line 13
    .line 14
    iput-boolean p4, p0, Lt44;->p:Z

    .line 15
    .line 16
    iget-object p2, p1, Lz47;->Y:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast p2, Lc6;

    .line 19
    .line 20
    iget-object p2, p2, Lc6;->f0:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast p2, Lve4;

    .line 23
    .line 24
    new-instance p3, Lq44;

    .line 25
    .line 26
    invoke-direct {p3, p0, p1}, Lq44;-><init>(Lt44;Lz47;)V

    .line 27
    .line 28
    .line 29
    new-instance p4, Lte4;

    .line 30
    .line 31
    invoke-direct {p4, p2, p3}, Lse4;-><init>(Lve4;Ldn2;)V

    .line 32
    .line 33
    .line 34
    iput-object p4, p0, Lt44;->q:Lte4;

    .line 35
    .line 36
    new-instance p3, Lr44;

    .line 37
    .line 38
    const/4 p4, 0x0

    .line 39
    invoke-direct {p3, p0, p4}, Lr44;-><init>(Lt44;B)V

    .line 40
    .line 41
    .line 42
    new-instance p4, Lte4;

    .line 43
    .line 44
    invoke-direct {p4, p2, p3}, Lse4;-><init>(Lve4;Ldn2;)V

    .line 45
    .line 46
    .line 47
    iput-object p4, p0, Lt44;->r:Lte4;

    .line 48
    .line 49
    new-instance p3, Lq44;

    .line 50
    .line 51
    invoke-direct {p3, p1, p0}, Lq44;-><init>(Lz47;Lt44;)V

    .line 52
    .line 53
    .line 54
    new-instance p4, Lte4;

    .line 55
    .line 56
    invoke-direct {p4, p2, p3}, Lse4;-><init>(Lve4;Ldn2;)V

    .line 57
    .line 58
    .line 59
    iput-object p4, p0, Lt44;->s:Lte4;

    .line 60
    .line 61
    new-instance p3, Lr44;

    .line 62
    .line 63
    const/4 p4, 0x1

    .line 64
    invoke-direct {p3, p0, p4}, Lr44;-><init>(Lt44;B)V

    .line 65
    .line 66
    .line 67
    new-instance p4, Lte4;

    .line 68
    .line 69
    invoke-direct {p4, p2, p3}, Lse4;-><init>(Lve4;Ldn2;)V

    .line 70
    .line 71
    .line 72
    iput-object p4, p0, Lt44;->t:Lte4;

    .line 73
    .line 74
    new-instance p3, Ld3;

    .line 75
    .line 76
    const/16 p4, 0xa

    .line 77
    .line 78
    invoke-direct {p3, p0, p1, p4}, Ld3;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {p2, p3}, Lve4;->c(Lgn2;)Lvt1;

    .line 82
    .line 83
    .line 84
    move-result-object p1

    .line 85
    iput-object p1, p0, Lt44;->u:Lvt1;

    .line 86
    .line 87
    return-void
.end method

.method public static A(Lq97;Lho2;Ljava/util/AbstractCollection;)Lq97;
    .locals 2

    .line 1
    invoke-interface {p2}, Ljava/util/Collection;->isEmpty()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 9
    .line 10
    .line 11
    move-result-object p2

    .line 12
    :cond_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-eqz v0, :cond_2

    .line 17
    .line 18
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    check-cast v0, Lq97;

    .line 23
    .line 24
    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    if-nez v1, :cond_1

    .line 29
    .line 30
    iget-object v1, v0, Ljo2;->F0:Lho2;

    .line 31
    .line 32
    if-nez v1, :cond_1

    .line 33
    .line 34
    invoke-static {v0, p1}, Lt44;->D(Lho2;Lho2;)Z

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    if-eqz v0, :cond_1

    .line 39
    .line 40
    invoke-interface {p0}, Lho2;->i0()Lgo2;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    invoke-interface {p0}, Lgo2;->v()Lgo2;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    invoke-interface {p0}, Lgo2;->build()Lho2;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 53
    .line 54
    .line 55
    check-cast p0, Lq97;

    .line 56
    .line 57
    :cond_2
    :goto_0
    return-object p0
.end method

.method public static B(Lq97;)Lq97;
    .locals 4

    .line 1
    invoke-virtual {p0}, Ljo2;->L()Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    invoke-static {v0}, Lwv0;->B0(Ljava/util/List;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    check-cast v0, Lot8;

    .line 13
    .line 14
    const/4 v1, 0x0

    .line 15
    if-eqz v0, :cond_5

    .line 16
    .line 17
    invoke-virtual {v0}, Lqt8;->c()Lt14;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    invoke-virtual {v2}, Lt14;->n0()Llh8;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    invoke-interface {v2}, Llh8;->x()Lot0;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    if-eqz v2, :cond_1

    .line 30
    .line 31
    sget v3, Lel1;->a:I

    .line 32
    .line 33
    invoke-static {v2}, Lbl1;->f(Led1;)Lgk2;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v2}, Lgk2;->d()Z

    .line 41
    .line 42
    .line 43
    move-result v3

    .line 44
    if-eqz v3, :cond_0

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_0
    move-object v2, v1

    .line 48
    :goto_0
    if-eqz v2, :cond_1

    .line 49
    .line 50
    invoke-virtual {v2}, Lgk2;->i()Lfk2;

    .line 51
    .line 52
    .line 53
    move-result-object v2

    .line 54
    goto :goto_1

    .line 55
    :cond_1
    move-object v2, v1

    .line 56
    :goto_1
    sget-object v3, Lug7;->g:Lfk2;

    .line 57
    .line 58
    invoke-static {v2, v3}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    move-result v2

    .line 62
    if-eqz v2, :cond_2

    .line 63
    .line 64
    goto :goto_2

    .line 65
    :cond_2
    move-object v0, v1

    .line 66
    :goto_2
    if-nez v0, :cond_3

    .line 67
    .line 68
    goto :goto_3

    .line 69
    :cond_3
    invoke-interface {p0}, Lho2;->i0()Lgo2;

    .line 70
    .line 71
    .line 72
    move-result-object v1

    .line 73
    invoke-virtual {p0}, Ljo2;->L()Ljava/util/List;

    .line 74
    .line 75
    .line 76
    move-result-object p0

    .line 77
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 78
    .line 79
    .line 80
    const/4 v2, 0x1

    .line 81
    invoke-static {v2, p0}, Lwv0;->p0(ILjava/util/List;)Ljava/util/List;

    .line 82
    .line 83
    .line 84
    move-result-object p0

    .line 85
    invoke-interface {v1, p0}, Lgo2;->a(Ljava/util/List;)Lgo2;

    .line 86
    .line 87
    .line 88
    move-result-object p0

    .line 89
    invoke-virtual {v0}, Lqt8;->c()Lt14;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    invoke-virtual {v0}, Lt14;->l0()Ljava/util/List;

    .line 94
    .line 95
    .line 96
    move-result-object v0

    .line 97
    const/4 v1, 0x0

    .line 98
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object v0

    .line 102
    check-cast v0, Lni8;

    .line 103
    .line 104
    invoke-virtual {v0}, Lni8;->b()Lt14;

    .line 105
    .line 106
    .line 107
    move-result-object v0

    .line 108
    invoke-interface {p0, v0}, Lgo2;->r(Lt14;)Lgo2;

    .line 109
    .line 110
    .line 111
    move-result-object p0

    .line 112
    invoke-interface {p0}, Lgo2;->build()Lho2;

    .line 113
    .line 114
    .line 115
    move-result-object p0

    .line 116
    check-cast p0, Lq97;

    .line 117
    .line 118
    if-eqz p0, :cond_4

    .line 119
    .line 120
    iput-boolean v2, p0, Ljo2;->y0:Z

    .line 121
    .line 122
    :cond_4
    return-object p0

    .line 123
    :cond_5
    :goto_3
    return-object v1
.end method

.method public static D(Lho2;Lho2;)Z
    .locals 2

    .line 1
    sget-object v0, Lhf5;->c:Lhf5;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-virtual {v0, p1, p0, v1}, Lhf5;->n(Ljd0;Ljd0;Z)Lgf5;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-virtual {v0}, Lgf5;->b()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    if-ne v0, v1, :cond_0

    .line 15
    .line 16
    invoke-static {p1, p0}, Lw39;->u(Ljd0;Ljd0;)Z

    .line 17
    .line 18
    .line 19
    move-result p0

    .line 20
    if-nez p0, :cond_0

    .line 21
    .line 22
    return v1

    .line 23
    :cond_0
    const/4 p0, 0x0

    .line 24
    return p0

    .line 25
    :cond_1
    const/4 p0, 0x0

    .line 26
    throw p0
.end method

.method public static E(Lq97;Lq97;)Z
    .locals 2

    .line 1
    sget v0, Lsa0;->l:I

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lfd1;->getName()Lv15;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {v0}, Lv15;->b()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    const-string v1, "removeAt"

    .line 15
    .line 16
    invoke-static {v0, v1}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-eqz v0, :cond_0

    .line 21
    .line 22
    invoke-static {p0}, Lw45;->z(Ljd0;)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    sget-object v1, Lff7;->g:Lbf7;

    .line 27
    .line 28
    iget-object v1, v1, Lbf7;->e:Ljava/lang/String;

    .line 29
    .line 30
    invoke-static {v0, v1}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    if-eqz v0, :cond_0

    .line 35
    .line 36
    invoke-virtual {p1}, Lq97;->S0()Lq97;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 41
    .line 42
    .line 43
    invoke-static {p1, p0}, Lt44;->D(Lho2;Lho2;)Z

    .line 44
    .line 45
    .line 46
    move-result p0

    .line 47
    return p0
.end method

.method public static F(Lfx5;Ljava/lang/String;Lgn2;)Lq97;
    .locals 4

    .line 1
    invoke-static {p1}, Lv15;->e(Ljava/lang/String;)Lv15;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-interface {p2, p1}, Lgn2;->B(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Ljava/lang/Iterable;

    .line 10
    .line 11
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 16
    .line 17
    .line 18
    move-result p2

    .line 19
    const/4 v0, 0x0

    .line 20
    if-eqz p2, :cond_4

    .line 21
    .line 22
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object p2

    .line 26
    check-cast p2, Lq97;

    .line 27
    .line 28
    invoke-virtual {p2}, Ljo2;->L()Ljava/util/List;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    if-eqz v1, :cond_1

    .line 37
    .line 38
    goto :goto_1

    .line 39
    :cond_1
    sget-object v1, Lv14;->a:Lq45;

    .line 40
    .line 41
    iget-object v2, p2, Ljo2;->k0:Lt14;

    .line 42
    .line 43
    if-nez v2, :cond_2

    .line 44
    .line 45
    const/4 v1, 0x0

    .line 46
    goto :goto_0

    .line 47
    :cond_2
    invoke-interface {p0}, Lgt8;->c()Lt14;

    .line 48
    .line 49
    .line 50
    move-result-object v3

    .line 51
    invoke-virtual {v1, v2, v3}, Lq45;->b(Lt14;Lt14;)Z

    .line 52
    .line 53
    .line 54
    move-result v1

    .line 55
    :goto_0
    if-eqz v1, :cond_3

    .line 56
    .line 57
    move-object v0, p2

    .line 58
    :cond_3
    :goto_1
    if-eqz v0, :cond_0

    .line 59
    .line 60
    :cond_4
    return-object v0
.end method

.method public static H(Lfx5;Lgn2;)Lq97;
    .locals 5

    .line 1
    invoke-interface {p0}, Led1;->getName()Lv15;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lv15;->b()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    invoke-static {v0}, Ljs3;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-static {v0}, Lv15;->e(Ljava/lang/String;)Lv15;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-interface {p1, v0}, Lgn2;->B(Ljava/lang/Object;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    check-cast p1, Ljava/lang/Iterable;

    .line 25
    .line 26
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    const/4 v1, 0x0

    .line 35
    if-eqz v0, :cond_5

    .line 36
    .line 37
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    check-cast v0, Lq97;

    .line 42
    .line 43
    invoke-virtual {v0}, Ljo2;->L()Ljava/util/List;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 48
    .line 49
    .line 50
    move-result v2

    .line 51
    const/4 v3, 0x1

    .line 52
    if-eq v2, v3, :cond_1

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_1
    iget-object v2, v0, Ljo2;->k0:Lt14;

    .line 56
    .line 57
    if-nez v2, :cond_2

    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_2
    sget-object v3, Lzz3;->e:Lv15;

    .line 61
    .line 62
    sget-object v3, Ltg7;->d:Lgk2;

    .line 63
    .line 64
    invoke-static {v2, v3}, Lzz3;->E(Lt14;Lgk2;)Z

    .line 65
    .line 66
    .line 67
    move-result v2

    .line 68
    if-nez v2, :cond_3

    .line 69
    .line 70
    goto :goto_0

    .line 71
    :cond_3
    sget-object v2, Lv14;->a:Lq45;

    .line 72
    .line 73
    invoke-virtual {v0}, Ljo2;->L()Ljava/util/List;

    .line 74
    .line 75
    .line 76
    move-result-object v3

    .line 77
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 78
    .line 79
    .line 80
    invoke-static {v3}, Lwv0;->O0(Ljava/util/List;)Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v3

    .line 84
    check-cast v3, Lot8;

    .line 85
    .line 86
    invoke-virtual {v3}, Lqt8;->c()Lt14;

    .line 87
    .line 88
    .line 89
    move-result-object v3

    .line 90
    invoke-interface {p0}, Lgt8;->c()Lt14;

    .line 91
    .line 92
    .line 93
    move-result-object v4

    .line 94
    invoke-virtual {v2, v3, v4}, Lq45;->a(Lt14;Lt14;)Z

    .line 95
    .line 96
    .line 97
    move-result v2

    .line 98
    if-eqz v2, :cond_4

    .line 99
    .line 100
    move-object v1, v0

    .line 101
    :cond_4
    :goto_0
    if-eqz v1, :cond_0

    .line 102
    .line 103
    :cond_5
    return-object v1
.end method

.method public static K(Lq97;Lho2;)Z
    .locals 3

    .line 1
    const/4 v0, 0x2

    .line 2
    invoke-static {p0, v0}, Lw45;->y(Lho2;I)Ljava/lang/String;

    .line 3
    .line 4
    .line 5
    move-result-object v1

    .line 6
    invoke-interface {p1}, Lho2;->a()Lho2;

    .line 7
    .line 8
    .line 9
    move-result-object v2

    .line 10
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    invoke-static {v2, v0}, Lw45;->y(Lho2;I)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-virtual {v1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-eqz v0, :cond_0

    .line 22
    .line 23
    invoke-static {p0, p1}, Lt44;->D(Lho2;Lho2;)Z

    .line 24
    .line 25
    .line 26
    move-result p0

    .line 27
    if-nez p0, :cond_0

    .line 28
    .line 29
    const/4 p0, 0x1

    .line 30
    return p0

    .line 31
    :cond_0
    const/4 p0, 0x0

    .line 32
    return p0
.end method


# virtual methods
.method public final C(Lfx5;Lgn2;)Z
    .locals 1

    .line 1
    invoke-static {p1}, Lvj8;->V(Lfx5;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    goto :goto_1

    .line 8
    :cond_0
    invoke-virtual {p0, p1, p2}, Lt44;->G(Lfx5;Lgn2;)Lq97;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    invoke-static {p1, p2}, Lt44;->H(Lfx5;Lgn2;)Lq97;

    .line 13
    .line 14
    .line 15
    move-result-object p2

    .line 16
    if-nez p0, :cond_1

    .line 17
    .line 18
    goto :goto_1

    .line 19
    :cond_1
    invoke-interface {p1}, Lpt8;->R()Z

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    if-nez p1, :cond_2

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_2
    if-eqz p2, :cond_3

    .line 27
    .line 28
    invoke-virtual {p2}, Ljo2;->m()Lfx4;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    invoke-virtual {p0}, Ljo2;->m()Lfx4;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    if-ne p1, p0, :cond_3

    .line 37
    .line 38
    :goto_0
    const/4 p0, 0x1

    .line 39
    return p0

    .line 40
    :cond_3
    :goto_1
    const/4 p0, 0x0

    .line 41
    return p0
.end method

.method public final G(Lfx5;Lgn2;)Lq97;
    .locals 4

    .line 1
    invoke-interface {p1}, Lfx5;->b()Lhx5;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-static {v0}, Lgv3;->A(Lld0;)Lld0;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    check-cast v0, Lhx5;

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    move-object v0, v1

    .line 16
    :goto_0
    if-eqz v0, :cond_2

    .line 17
    .line 18
    invoke-static {v0}, Lzz3;->A(Led1;)Z

    .line 19
    .line 20
    .line 21
    invoke-static {v0}, Lel1;->i(Lld0;)Lld0;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    sget-object v3, Lag;->s0:Lag;

    .line 26
    .line 27
    invoke-static {v2, v3}, Lel1;->b(Lld0;Lgn2;)Lld0;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    if-nez v2, :cond_1

    .line 32
    .line 33
    goto :goto_1

    .line 34
    :cond_1
    sget-object v3, Lua0;->a:Ljava/util/Map;

    .line 35
    .line 36
    invoke-static {v2}, Lel1;->g(Led1;)Lfk2;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    invoke-interface {v3, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    check-cast v2, Lv15;

    .line 45
    .line 46
    if-eqz v2, :cond_2

    .line 47
    .line 48
    invoke-virtual {v2}, Lv15;->b()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    :cond_2
    :goto_1
    if-eqz v1, :cond_3

    .line 53
    .line 54
    iget-object p0, p0, Lt44;->n:Lsx4;

    .line 55
    .line 56
    invoke-static {p0, v0}, Lgv3;->D(Lsx4;Lld0;)Z

    .line 57
    .line 58
    .line 59
    move-result p0

    .line 60
    if-nez p0, :cond_3

    .line 61
    .line 62
    invoke-static {p1, v1, p2}, Lt44;->F(Lfx5;Ljava/lang/String;Lgn2;)Lq97;

    .line 63
    .line 64
    .line 65
    move-result-object p0

    .line 66
    return-object p0

    .line 67
    :cond_3
    invoke-interface {p1}, Led1;->getName()Lv15;

    .line 68
    .line 69
    .line 70
    move-result-object p0

    .line 71
    invoke-virtual {p0}, Lv15;->b()Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object p0

    .line 75
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 76
    .line 77
    .line 78
    invoke-static {p0}, Ljs3;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object p0

    .line 82
    invoke-static {p1, p0, p2}, Lt44;->F(Lfx5;Ljava/lang/String;Lgn2;)Lq97;

    .line 83
    .line 84
    .line 85
    move-result-object p0

    .line 86
    return-object p0
.end method

.method public final I(Lv15;)Ljava/util/LinkedHashSet;
    .locals 3

    .line 1
    invoke-virtual {p0}, Lt44;->z()Ljava/util/Collection;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Ljava/lang/Iterable;

    .line 6
    .line 7
    new-instance v0, Ljava/util/LinkedHashSet;

    .line 8
    .line 9
    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    .line 10
    .line 11
    .line 12
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    if-eqz v1, :cond_0

    .line 21
    .line 22
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    check-cast v1, Lt14;

    .line 27
    .line 28
    invoke-virtual {v1}, Lt14;->K()Let4;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    sget-object v2, Lx45;->g0:Lx45;

    .line 33
    .line 34
    invoke-interface {v1, p1, v2}, Let4;->b(Lv15;Lx45;)Ljava/util/Collection;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    check-cast v1, Ljava/lang/Iterable;

    .line 39
    .line 40
    invoke-static {v0, v1}, Lbw0;->d0(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 41
    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_0
    return-object v0
.end method

.method public final J(Lv15;)Ljava/util/Set;
    .locals 4

    .line 1
    invoke-virtual {p0}, Lt44;->z()Ljava/util/Collection;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Ljava/lang/Iterable;

    .line 6
    .line 7
    new-instance v0, Ljava/util/ArrayList;

    .line 8
    .line 9
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 10
    .line 11
    .line 12
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    if-eqz v1, :cond_1

    .line 21
    .line 22
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    check-cast v1, Lt14;

    .line 27
    .line 28
    invoke-virtual {v1}, Lt14;->K()Let4;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    sget-object v2, Lx45;->g0:Lx45;

    .line 33
    .line 34
    invoke-interface {v1, p1, v2}, Let4;->f(Lv15;Lx45;)Ljava/util/Collection;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    check-cast v1, Ljava/lang/Iterable;

    .line 39
    .line 40
    new-instance v2, Ljava/util/ArrayList;

    .line 41
    .line 42
    const/16 v3, 0xa

    .line 43
    .line 44
    invoke-static {v1, v3}, Lxv0;->Z(Ljava/lang/Iterable;I)I

    .line 45
    .line 46
    .line 47
    move-result v3

    .line 48
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 49
    .line 50
    .line 51
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 56
    .line 57
    .line 58
    move-result v3

    .line 59
    if-eqz v3, :cond_0

    .line 60
    .line 61
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v3

    .line 65
    check-cast v3, Lfx5;

    .line 66
    .line 67
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    goto :goto_1

    .line 71
    :cond_0
    invoke-static {v0, v2}, Lbw0;->d0(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 72
    .line 73
    .line 74
    goto :goto_0

    .line 75
    :cond_1
    invoke-static {v0}, Lwv0;->c1(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 76
    .line 77
    .line 78
    move-result-object p0

    .line 79
    return-object p0
.end method

.method public final L(Lq97;)Z
    .locals 6

    .line 1
    invoke-virtual {p1}, Lfd1;->getName()Lv15;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    invoke-static {v0}, Lz91;->F(Lv15;)Ljava/util/List;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    const/4 v2, 0x0

    .line 17
    if-eqz v1, :cond_0

    .line 18
    .line 19
    goto :goto_1

    .line 20
    :cond_0
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    if-eqz v1, :cond_4

    .line 29
    .line 30
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    check-cast v1, Lv15;

    .line 35
    .line 36
    invoke-virtual {p0, v1}, Lt44;->J(Lv15;)Ljava/util/Set;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    check-cast v1, Ljava/lang/Iterable;

    .line 41
    .line 42
    instance-of v3, v1, Ljava/util/Collection;

    .line 43
    .line 44
    if-eqz v3, :cond_2

    .line 45
    .line 46
    move-object v3, v1

    .line 47
    check-cast v3, Ljava/util/Collection;

    .line 48
    .line 49
    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    .line 50
    .line 51
    .line 52
    move-result v3

    .line 53
    if-eqz v3, :cond_2

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_2
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    :cond_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 61
    .line 62
    .line 63
    move-result v3

    .line 64
    if-eqz v3, :cond_1

    .line 65
    .line 66
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v3

    .line 70
    check-cast v3, Lfx5;

    .line 71
    .line 72
    new-instance v4, Ld3;

    .line 73
    .line 74
    const/16 v5, 0xb

    .line 75
    .line 76
    invoke-direct {v4, p1, p0, v5}, Ld3;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 77
    .line 78
    .line 79
    invoke-virtual {p0, v3, v4}, Lt44;->C(Lfx5;Lgn2;)Z

    .line 80
    .line 81
    .line 82
    move-result v4

    .line 83
    if-eqz v4, :cond_3

    .line 84
    .line 85
    invoke-interface {v3}, Lpt8;->R()Z

    .line 86
    .line 87
    .line 88
    move-result v3

    .line 89
    if-nez v3, :cond_15

    .line 90
    .line 91
    invoke-virtual {p1}, Lfd1;->getName()Lv15;

    .line 92
    .line 93
    .line 94
    move-result-object v3

    .line 95
    invoke-virtual {v3}, Lv15;->b()Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object v3

    .line 99
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 100
    .line 101
    .line 102
    sget-object v4, Ljs3;->a:Lfk2;

    .line 103
    .line 104
    const-string v4, "set"

    .line 105
    .line 106
    invoke-static {v3, v2, v4}, Lmm7;->Z(Ljava/lang/String;ZLjava/lang/String;)Z

    .line 107
    .line 108
    .line 109
    move-result v3

    .line 110
    if-nez v3, :cond_3

    .line 111
    .line 112
    goto/16 :goto_6

    .line 113
    .line 114
    :cond_4
    :goto_1
    sget-object v0, Lff7;->a:Ljava/util/ArrayList;

    .line 115
    .line 116
    invoke-virtual {p1}, Lfd1;->getName()Lv15;

    .line 117
    .line 118
    .line 119
    move-result-object v0

    .line 120
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 121
    .line 122
    .line 123
    sget-object v1, Lff7;->k:Ljava/util/LinkedHashMap;

    .line 124
    .line 125
    invoke-virtual {v1, v0}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    move-result-object v0

    .line 129
    check-cast v0, Lv15;

    .line 130
    .line 131
    if-nez v0, :cond_5

    .line 132
    .line 133
    goto :goto_3

    .line 134
    :cond_5
    invoke-virtual {p0, v0}, Lt44;->I(Lv15;)Ljava/util/LinkedHashSet;

    .line 135
    .line 136
    .line 137
    move-result-object v1

    .line 138
    new-instance v3, Ljava/util/ArrayList;

    .line 139
    .line 140
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 141
    .line 142
    .line 143
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 144
    .line 145
    .line 146
    move-result-object v1

    .line 147
    :cond_6
    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 148
    .line 149
    .line 150
    move-result v4

    .line 151
    if-eqz v4, :cond_7

    .line 152
    .line 153
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 154
    .line 155
    .line 156
    move-result-object v4

    .line 157
    move-object v5, v4

    .line 158
    check-cast v5, Lq97;

    .line 159
    .line 160
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 161
    .line 162
    .line 163
    invoke-static {v5}, Lgv3;->A(Lld0;)Lld0;

    .line 164
    .line 165
    .line 166
    move-result-object v5

    .line 167
    if-eqz v5, :cond_6

    .line 168
    .line 169
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 170
    .line 171
    .line 172
    goto :goto_2

    .line 173
    :cond_7
    invoke-virtual {v3}, Ljava/util/ArrayList;->isEmpty()Z

    .line 174
    .line 175
    .line 176
    move-result v1

    .line 177
    if-eqz v1, :cond_8

    .line 178
    .line 179
    goto :goto_3

    .line 180
    :cond_8
    invoke-interface {p1}, Lho2;->i0()Lgo2;

    .line 181
    .line 182
    .line 183
    move-result-object v1

    .line 184
    invoke-interface {v1, v0}, Lgo2;->x(Lv15;)Lgo2;

    .line 185
    .line 186
    .line 187
    invoke-interface {v1}, Lgo2;->z()Lgo2;

    .line 188
    .line 189
    .line 190
    invoke-interface {v1}, Lgo2;->g()Lgo2;

    .line 191
    .line 192
    .line 193
    invoke-interface {v1}, Lgo2;->build()Lho2;

    .line 194
    .line 195
    .line 196
    move-result-object v0

    .line 197
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 198
    .line 199
    .line 200
    check-cast v0, Lq97;

    .line 201
    .line 202
    invoke-virtual {v3}, Ljava/util/ArrayList;->isEmpty()Z

    .line 203
    .line 204
    .line 205
    move-result v1

    .line 206
    if-eqz v1, :cond_9

    .line 207
    .line 208
    goto :goto_3

    .line 209
    :cond_9
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 210
    .line 211
    .line 212
    move-result-object v1

    .line 213
    :cond_a
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 214
    .line 215
    .line 216
    move-result v3

    .line 217
    if-eqz v3, :cond_b

    .line 218
    .line 219
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 220
    .line 221
    .line 222
    move-result-object v3

    .line 223
    check-cast v3, Lq97;

    .line 224
    .line 225
    invoke-static {v3, v0}, Lt44;->E(Lq97;Lq97;)Z

    .line 226
    .line 227
    .line 228
    move-result v3

    .line 229
    if-eqz v3, :cond_a

    .line 230
    .line 231
    goto/16 :goto_6

    .line 232
    .line 233
    :cond_b
    :goto_3
    sget v0, Lta0;->l:I

    .line 234
    .line 235
    invoke-virtual {p1}, Lfd1;->getName()Lv15;

    .line 236
    .line 237
    .line 238
    move-result-object v0

    .line 239
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 240
    .line 241
    .line 242
    sget-object v1, Lff7;->e:Ljava/util/Set;

    .line 243
    .line 244
    invoke-interface {v1, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 245
    .line 246
    .line 247
    move-result v0

    .line 248
    if-nez v0, :cond_c

    .line 249
    .line 250
    goto :goto_5

    .line 251
    :cond_c
    invoke-virtual {p1}, Lfd1;->getName()Lv15;

    .line 252
    .line 253
    .line 254
    move-result-object v0

    .line 255
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 256
    .line 257
    .line 258
    invoke-virtual {p0, v0}, Lt44;->I(Lv15;)Ljava/util/LinkedHashSet;

    .line 259
    .line 260
    .line 261
    move-result-object v0

    .line 262
    new-instance v1, Ljava/util/ArrayList;

    .line 263
    .line 264
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 265
    .line 266
    .line 267
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 268
    .line 269
    .line 270
    move-result-object v0

    .line 271
    :cond_d
    :goto_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 272
    .line 273
    .line 274
    move-result v3

    .line 275
    if-eqz v3, :cond_e

    .line 276
    .line 277
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 278
    .line 279
    .line 280
    move-result-object v3

    .line 281
    check-cast v3, Lq97;

    .line 282
    .line 283
    invoke-static {v3}, Lta0;->a(Lho2;)Lho2;

    .line 284
    .line 285
    .line 286
    move-result-object v3

    .line 287
    if-eqz v3, :cond_d

    .line 288
    .line 289
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 290
    .line 291
    .line 292
    goto :goto_4

    .line 293
    :cond_e
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 294
    .line 295
    .line 296
    move-result v0

    .line 297
    if-eqz v0, :cond_f

    .line 298
    .line 299
    goto :goto_5

    .line 300
    :cond_f
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 301
    .line 302
    .line 303
    move-result-object v0

    .line 304
    :cond_10
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 305
    .line 306
    .line 307
    move-result v1

    .line 308
    if-eqz v1, :cond_11

    .line 309
    .line 310
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 311
    .line 312
    .line 313
    move-result-object v1

    .line 314
    check-cast v1, Lho2;

    .line 315
    .line 316
    invoke-static {p1, v1}, Lt44;->K(Lq97;Lho2;)Z

    .line 317
    .line 318
    .line 319
    move-result v1

    .line 320
    if-eqz v1, :cond_10

    .line 321
    .line 322
    goto :goto_6

    .line 323
    :cond_11
    :goto_5
    invoke-static {p1}, Lt44;->B(Lq97;)Lq97;

    .line 324
    .line 325
    .line 326
    move-result-object v0

    .line 327
    if-nez v0, :cond_12

    .line 328
    .line 329
    goto :goto_7

    .line 330
    :cond_12
    invoke-virtual {p1}, Lfd1;->getName()Lv15;

    .line 331
    .line 332
    .line 333
    move-result-object p1

    .line 334
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 335
    .line 336
    .line 337
    invoke-virtual {p0, p1}, Lt44;->I(Lv15;)Ljava/util/LinkedHashSet;

    .line 338
    .line 339
    .line 340
    move-result-object p0

    .line 341
    invoke-interface {p0}, Ljava/util/Collection;->isEmpty()Z

    .line 342
    .line 343
    .line 344
    move-result p1

    .line 345
    if-eqz p1, :cond_13

    .line 346
    .line 347
    goto :goto_7

    .line 348
    :cond_13
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 349
    .line 350
    .line 351
    move-result-object p0

    .line 352
    :cond_14
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 353
    .line 354
    .line 355
    move-result p1

    .line 356
    if-eqz p1, :cond_16

    .line 357
    .line 358
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 359
    .line 360
    .line 361
    move-result-object p1

    .line 362
    check-cast p1, Lq97;

    .line 363
    .line 364
    invoke-interface {p1}, Lho2;->h()Z

    .line 365
    .line 366
    .line 367
    move-result v1

    .line 368
    if-eqz v1, :cond_14

    .line 369
    .line 370
    invoke-static {v0, p1}, Lt44;->D(Lho2;Lho2;)Z

    .line 371
    .line 372
    .line 373
    move-result p1

    .line 374
    if-eqz p1, :cond_14

    .line 375
    .line 376
    :cond_15
    :goto_6
    return v2

    .line 377
    :cond_16
    :goto_7
    const/4 p0, 0x1

    .line 378
    return p0
.end method

.method public final M(Lv15;Lx45;)V
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
    iget-object p1, p0, Lf54;->b:Lz47;

    .line 8
    .line 9
    iget-object p1, p1, Lz47;->Y:Ljava/lang/Object;

    .line 10
    .line 11
    iget-object p0, p0, Lt44;->n:Lsx4;

    .line 12
    .line 13
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final N(Lv15;)Ljava/util/ArrayList;
    .locals 2

    .line 1
    iget-object v0, p0, Lf54;->e:Lte4;

    .line 2
    .line 3
    invoke-virtual {v0}, Lte4;->invoke()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lld1;

    .line 8
    .line 9
    invoke-interface {v0, p1}, Lld1;->c(Lv15;)Ljava/util/Collection;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    check-cast p1, Ljava/lang/Iterable;

    .line 14
    .line 15
    new-instance v0, Ljava/util/ArrayList;

    .line 16
    .line 17
    const/16 v1, 0xa

    .line 18
    .line 19
    invoke-static {p1, v1}, Lxv0;->Z(Ljava/lang/Iterable;I)I

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 24
    .line 25
    .line 26
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    if-eqz v1, :cond_0

    .line 35
    .line 36
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    check-cast v1, Lcb6;

    .line 41
    .line 42
    invoke-virtual {p0, v1}, Lf54;->t(Lcb6;)Ldl3;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_0
    return-object v0
.end method

.method public final O(Lv15;)Ljava/util/ArrayList;
    .locals 3

    .line 1
    invoke-virtual {p0, p1}, Lt44;->I(Lv15;)Ljava/util/LinkedHashSet;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    new-instance p1, Ljava/util/ArrayList;

    .line 6
    .line 7
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 8
    .line 9
    .line 10
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-eqz v0, :cond_2

    .line 19
    .line 20
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    move-object v1, v0

    .line 25
    check-cast v1, Lq97;

    .line 26
    .line 27
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    invoke-static {v1}, Lgv3;->A(Lld0;)Lld0;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    if-eqz v2, :cond_0

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_0
    invoke-static {v1}, Lta0;->a(Lho2;)Lho2;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    if-eqz v1, :cond_1

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_1
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_2
    return-object p1
.end method

.method public final b(Lv15;Lx45;)Ljava/util/Collection;
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, p1, p2}, Lt44;->M(Lv15;Lx45;)V

    .line 5
    .line 6
    .line 7
    invoke-super {p0, p1, p2}, Lf54;->b(Lv15;Lx45;)Ljava/util/Collection;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0
.end method

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
    invoke-virtual {p0, p1, p2}, Lt44;->M(Lv15;Lx45;)V

    .line 8
    .line 9
    .line 10
    iget-object p2, p0, Lf54;->c:Lf54;

    .line 11
    .line 12
    check-cast p2, Lt44;

    .line 13
    .line 14
    if-eqz p2, :cond_0

    .line 15
    .line 16
    iget-object p2, p2, Lt44;->u:Lvt1;

    .line 17
    .line 18
    if-eqz p2, :cond_0

    .line 19
    .line 20
    invoke-virtual {p2, p1}, Lvt1;->B(Ljava/lang/Object;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object p2

    .line 24
    check-cast p2, Lsx4;

    .line 25
    .line 26
    if-eqz p2, :cond_0

    .line 27
    .line 28
    return-object p2

    .line 29
    :cond_0
    iget-object p0, p0, Lt44;->u:Lvt1;

    .line 30
    .line 31
    invoke-virtual {p0, p1}, Lvt1;->B(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    check-cast p0, Lot0;

    .line 36
    .line 37
    return-object p0
.end method

.method public final f(Lv15;Lx45;)Ljava/util/Collection;
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, p1, p2}, Lt44;->M(Lv15;Lx45;)V

    .line 5
    .line 6
    .line 7
    invoke-super {p0, p1, p2}, Lf54;->f(Lv15;Lx45;)Ljava/util/Collection;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0
.end method

.method public final h(Lpk1;Lgn2;)Ljava/util/Set;
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p1, p0, Lt44;->r:Lte4;

    .line 5
    .line 6
    invoke-virtual {p1}, Lte4;->invoke()Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    check-cast p1, Ljava/util/Set;

    .line 11
    .line 12
    iget-object p0, p0, Lt44;->t:Lte4;

    .line 13
    .line 14
    invoke-virtual {p0}, Lte4;->invoke()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    check-cast p0, Ljava/util/Map;

    .line 19
    .line 20
    invoke-interface {p0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    check-cast p0, Ljava/lang/Iterable;

    .line 25
    .line 26
    invoke-static {p1, p0}, Lq57;->Z(Ljava/util/Set;Ljava/lang/Iterable;)Ljava/util/LinkedHashSet;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    return-object p0
.end method

.method public final i(Lpk1;Lgn2;)Ljava/util/Set;
    .locals 4

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lt44;->n:Lsx4;

    .line 5
    .line 6
    invoke-interface {v0}, Lot0;->l()Llh8;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-interface {v1}, Llh8;->c()Ljava/util/Collection;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    check-cast v1, Ljava/lang/Iterable;

    .line 18
    .line 19
    new-instance v2, Ljava/util/LinkedHashSet;

    .line 20
    .line 21
    invoke-direct {v2}, Ljava/util/LinkedHashSet;-><init>()V

    .line 22
    .line 23
    .line 24
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 29
    .line 30
    .line 31
    move-result v3

    .line 32
    if-eqz v3, :cond_0

    .line 33
    .line 34
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v3

    .line 38
    check-cast v3, Lt14;

    .line 39
    .line 40
    invoke-virtual {v3}, Lt14;->K()Let4;

    .line 41
    .line 42
    .line 43
    move-result-object v3

    .line 44
    invoke-interface {v3}, Let4;->c()Ljava/util/Set;

    .line 45
    .line 46
    .line 47
    move-result-object v3

    .line 48
    check-cast v3, Ljava/lang/Iterable;

    .line 49
    .line 50
    invoke-static {v2, v3}, Lbw0;->d0(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 51
    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_0
    iget-object v1, p0, Lf54;->e:Lte4;

    .line 55
    .line 56
    invoke-virtual {v1}, Lte4;->invoke()Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v3

    .line 60
    check-cast v3, Lld1;

    .line 61
    .line 62
    invoke-interface {v3}, Lld1;->a()Ljava/util/Set;

    .line 63
    .line 64
    .line 65
    move-result-object v3

    .line 66
    check-cast v3, Ljava/util/Collection;

    .line 67
    .line 68
    invoke-virtual {v2, v3}, Ljava/util/AbstractCollection;->addAll(Ljava/util/Collection;)Z

    .line 69
    .line 70
    .line 71
    invoke-virtual {v1}, Lte4;->invoke()Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v1

    .line 75
    check-cast v1, Lld1;

    .line 76
    .line 77
    invoke-interface {v1}, Lld1;->e()Ljava/util/Set;

    .line 78
    .line 79
    .line 80
    move-result-object v1

    .line 81
    check-cast v1, Ljava/util/Collection;

    .line 82
    .line 83
    invoke-virtual {v2, v1}, Ljava/util/AbstractCollection;->addAll(Ljava/util/Collection;)Z

    .line 84
    .line 85
    .line 86
    invoke-virtual {p0, p1, p2}, Lt44;->h(Lpk1;Lgn2;)Ljava/util/Set;

    .line 87
    .line 88
    .line 89
    move-result-object p1

    .line 90
    invoke-virtual {v2, p1}, Ljava/util/AbstractCollection;->addAll(Ljava/util/Collection;)Z

    .line 91
    .line 92
    .line 93
    iget-object p0, p0, Lf54;->b:Lz47;

    .line 94
    .line 95
    iget-object p1, p0, Lz47;->Y:Ljava/lang/Object;

    .line 96
    .line 97
    check-cast p1, Lc6;

    .line 98
    .line 99
    iget-object p1, p1, Lc6;->r0:Ljava/lang/Object;

    .line 100
    .line 101
    check-cast p1, La08;

    .line 102
    .line 103
    check-cast p1, Lra;

    .line 104
    .line 105
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 106
    .line 107
    .line 108
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 109
    .line 110
    .line 111
    new-instance p0, Ljava/util/ArrayList;

    .line 112
    .line 113
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 114
    .line 115
    .line 116
    invoke-virtual {v2, p0}, Ljava/util/AbstractCollection;->addAll(Ljava/util/Collection;)Z

    .line 117
    .line 118
    .line 119
    return-object v2
.end method

.method public final j(Lv15;Ljava/util/ArrayList;)V
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-object v2, v0, Lt44;->o:Lta6;

    .line 6
    .line 7
    invoke-virtual {v2}, Lta6;->g()Z

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    iget-object v3, v0, Lt44;->n:Lsx4;

    .line 12
    .line 13
    iget-object v4, v0, Lf54;->b:Lz47;

    .line 14
    .line 15
    if-eqz v2, :cond_3

    .line 16
    .line 17
    iget-object v2, v0, Lf54;->e:Lte4;

    .line 18
    .line 19
    invoke-virtual {v2}, Lte4;->invoke()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v5

    .line 23
    check-cast v5, Lld1;

    .line 24
    .line 25
    invoke-interface {v5, v1}, Lld1;->b(Lv15;)Lfb6;

    .line 26
    .line 27
    .line 28
    move-result-object v5

    .line 29
    if-eqz v5, :cond_3

    .line 30
    .line 31
    invoke-interface/range {p2 .. p2}, Ljava/util/Collection;->isEmpty()Z

    .line 32
    .line 33
    .line 34
    move-result v5

    .line 35
    if-eqz v5, :cond_0

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_0
    invoke-interface/range {p2 .. p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 39
    .line 40
    .line 41
    move-result-object v5

    .line 42
    :cond_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 43
    .line 44
    .line 45
    move-result v6

    .line 46
    if-eqz v6, :cond_2

    .line 47
    .line 48
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v6

    .line 52
    check-cast v6, Lq97;

    .line 53
    .line 54
    invoke-virtual {v6}, Ljo2;->L()Ljava/util/List;

    .line 55
    .line 56
    .line 57
    move-result-object v6

    .line 58
    invoke-interface {v6}, Ljava/util/List;->isEmpty()Z

    .line 59
    .line 60
    .line 61
    move-result v6

    .line 62
    if-eqz v6, :cond_1

    .line 63
    .line 64
    goto :goto_1

    .line 65
    :cond_2
    :goto_0
    invoke-virtual {v2}, Lte4;->invoke()Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v2

    .line 69
    check-cast v2, Lld1;

    .line 70
    .line 71
    invoke-interface {v2, v1}, Lld1;->b(Lv15;)Lfb6;

    .line 72
    .line 73
    .line 74
    move-result-object v1

    .line 75
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 76
    .line 77
    .line 78
    invoke-static {v4, v1}, Lhi5;->w0(Lz47;Lvj3;)Ln44;

    .line 79
    .line 80
    .line 81
    move-result-object v2

    .line 82
    invoke-virtual {v1}, Lbb6;->c()Lv15;

    .line 83
    .line 84
    .line 85
    move-result-object v5

    .line 86
    invoke-static {v1}, Llh4;->Z0(Lfk3;)Lhr6;

    .line 87
    .line 88
    .line 89
    move-result-object v6

    .line 90
    const/4 v7, 0x1

    .line 91
    invoke-static {v3, v2, v5, v6, v7}, Ldl3;->V0(Led1;Ln44;Lv15;Lhr6;Z)Ldl3;

    .line 92
    .line 93
    .line 94
    move-result-object v8

    .line 95
    const/4 v2, 0x0

    .line 96
    const/4 v5, 0x6

    .line 97
    sget-object v6, Lzi8;->Y:Lzi8;

    .line 98
    .line 99
    const/4 v9, 0x0

    .line 100
    invoke-static {v6, v9, v2, v5}, Lpu;->U(Lzi8;ZLj54;I)Lnl3;

    .line 101
    .line 102
    .line 103
    move-result-object v2

    .line 104
    iget-object v5, v4, Lz47;->g0:Ljava/lang/Object;

    .line 105
    .line 106
    check-cast v5, Lf63;

    .line 107
    .line 108
    invoke-virtual {v1}, Lfb6;->f()Lgb6;

    .line 109
    .line 110
    .line 111
    move-result-object v1

    .line 112
    invoke-virtual {v5, v1, v2}, Lf63;->C(Lgb6;Lnl3;)Lt14;

    .line 113
    .line 114
    .line 115
    move-result-object v14

    .line 116
    invoke-virtual {v0}, Lt44;->p()Li44;

    .line 117
    .line 118
    .line 119
    move-result-object v10

    .line 120
    sget-object v0, Lfx4;->X:Lk32;

    .line 121
    .line 122
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 123
    .line 124
    .line 125
    sget-object v16, Lgl1;->e:Lfl1;

    .line 126
    .line 127
    const/16 v17, 0x0

    .line 128
    .line 129
    const/4 v9, 0x0

    .line 130
    sget-object v11, Ld02;->X:Ld02;

    .line 131
    .line 132
    sget-object v15, Lfx4;->f0:Lfx4;

    .line 133
    .line 134
    move-object v12, v11

    .line 135
    move-object v13, v11

    .line 136
    invoke-virtual/range {v8 .. v17}, Ldl3;->U0(Li44;Li44;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lt14;Lfx4;Lfl1;Ljava/util/Map;)Lq97;

    .line 137
    .line 138
    .line 139
    iput v7, v8, Ldl3;->H0:I

    .line 140
    .line 141
    move-object/from16 v0, p2

    .line 142
    .line 143
    invoke-virtual {v0, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 144
    .line 145
    .line 146
    :cond_3
    :goto_1
    iget-object v0, v4, Lz47;->Y:Ljava/lang/Object;

    .line 147
    .line 148
    check-cast v0, Lc6;

    .line 149
    .line 150
    iget-object v0, v0, Lc6;->r0:Ljava/lang/Object;

    .line 151
    .line 152
    check-cast v0, La08;

    .line 153
    .line 154
    check-cast v0, Lra;

    .line 155
    .line 156
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 157
    .line 158
    .line 159
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 160
    .line 161
    .line 162
    return-void
.end method

.method public final k()Lld1;
    .locals 2

    .line 1
    new-instance v0, Ljs0;

    .line 2
    .line 3
    iget-object p0, p0, Lt44;->o:Lta6;

    .line 4
    .line 5
    sget-object v1, Lcl1;->A0:Lcl1;

    .line 6
    .line 7
    invoke-direct {v0, p0, v1}, Ljs0;-><init>(Lta6;Lgn2;)V

    .line 8
    .line 9
    .line 10
    return-object v0
.end method

.method public final m(Ljava/util/LinkedHashSet;Lv15;)V
    .locals 12

    .line 1
    invoke-virtual {p0, p2}, Lt44;->I(Lv15;)Ljava/util/LinkedHashSet;

    .line 2
    .line 3
    .line 4
    move-result-object v2

    .line 5
    sget-object v3, Lff7;->a:Ljava/util/ArrayList;

    .line 6
    .line 7
    sget-object v3, Lff7;->j:Ljava/util/HashSet;

    .line 8
    .line 9
    invoke-virtual {v3, p2}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v3

    .line 13
    if-nez v3, :cond_5

    .line 14
    .line 15
    sget v3, Lta0;->l:I

    .line 16
    .line 17
    sget-object v3, Lff7;->e:Ljava/util/Set;

    .line 18
    .line 19
    invoke-interface {v3, p2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result v3

    .line 23
    if-nez v3, :cond_5

    .line 24
    .line 25
    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    .line 26
    .line 27
    .line 28
    move-result v3

    .line 29
    if-eqz v3, :cond_0

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 33
    .line 34
    .line 35
    move-result-object v3

    .line 36
    :cond_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 37
    .line 38
    .line 39
    move-result v4

    .line 40
    if-eqz v4, :cond_2

    .line 41
    .line 42
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v4

    .line 46
    check-cast v4, Lho2;

    .line 47
    .line 48
    invoke-interface {v4}, Lho2;->h()Z

    .line 49
    .line 50
    .line 51
    move-result v4

    .line 52
    if-eqz v4, :cond_1

    .line 53
    .line 54
    goto :goto_2

    .line 55
    :cond_2
    :goto_0
    new-instance v3, Ljava/util/ArrayList;

    .line 56
    .line 57
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 58
    .line 59
    .line 60
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 61
    .line 62
    .line 63
    move-result-object v2

    .line 64
    :cond_3
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 65
    .line 66
    .line 67
    move-result v4

    .line 68
    if-eqz v4, :cond_4

    .line 69
    .line 70
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v4

    .line 74
    move-object v5, v4

    .line 75
    check-cast v5, Lq97;

    .line 76
    .line 77
    invoke-virtual {p0, v5}, Lt44;->L(Lq97;)Z

    .line 78
    .line 79
    .line 80
    move-result v5

    .line 81
    if-eqz v5, :cond_3

    .line 82
    .line 83
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 84
    .line 85
    .line 86
    goto :goto_1

    .line 87
    :cond_4
    const/4 v2, 0x0

    .line 88
    invoke-virtual {p0, p1, p2, v3, v2}, Lt44;->w(Ljava/util/LinkedHashSet;Lv15;Ljava/util/ArrayList;Z)V

    .line 89
    .line 90
    .line 91
    return-void

    .line 92
    :cond_5
    :goto_2
    new-instance v9, Lpc7;

    .line 93
    .line 94
    invoke-direct {v9}, Lh2;-><init>()V

    .line 95
    .line 96
    .line 97
    iget-object v3, p0, Lf54;->b:Lz47;

    .line 98
    .line 99
    iget-object v3, v3, Lz47;->Y:Ljava/lang/Object;

    .line 100
    .line 101
    check-cast v3, Lc6;

    .line 102
    .line 103
    iget-object v3, v3, Lc6;->Z:Ljava/lang/Object;

    .line 104
    .line 105
    check-cast v3, Lp45;

    .line 106
    .line 107
    check-cast v3, Lq45;

    .line 108
    .line 109
    iget-object v6, v3, Lq45;->d:Lhf5;

    .line 110
    .line 111
    sget-object v3, Ld02;->X:Ld02;

    .line 112
    .line 113
    iget-object v4, p0, Lt44;->n:Lsx4;

    .line 114
    .line 115
    sget-object v5, Ll32;->n:Lk32;

    .line 116
    .line 117
    move-object v1, p2

    .line 118
    invoke-static/range {v1 .. v6}, Lch3;->Q(Lv15;Ljava/util/AbstractCollection;Ljava/util/Collection;Lsx4;Ll32;Lhf5;)Ljava/util/LinkedHashSet;

    .line 119
    .line 120
    .line 121
    move-result-object v10

    .line 122
    move-object v11, v2

    .line 123
    new-instance v5, Ld0;

    .line 124
    .line 125
    const/4 v6, 0x0

    .line 126
    const/16 v7, 0x14

    .line 127
    .line 128
    const/4 v1, 0x1

    .line 129
    const-class v3, Lt44;

    .line 130
    .line 131
    const-string v4, "searchMethodsByNameWithoutBuiltinMagic"

    .line 132
    .line 133
    move-object v0, v5

    .line 134
    const-string v5, "searchMethodsByNameWithoutBuiltinMagic(Lorg/jetbrains/kotlin/name/Name;)Ljava/util/Collection;"

    .line 135
    .line 136
    move-object v2, p0

    .line 137
    invoke-direct/range {v0 .. v7}, Ld0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 138
    .line 139
    .line 140
    move-object v6, v3

    .line 141
    move-object v4, p1

    .line 142
    move-object v2, p1

    .line 143
    move-object v1, p2

    .line 144
    move-object v5, v0

    .line 145
    move-object v3, v10

    .line 146
    move-object v0, p0

    .line 147
    invoke-virtual/range {v0 .. v5}, Lt44;->x(Lv15;Ljava/util/LinkedHashSet;Ljava/util/LinkedHashSet;Ljava/util/AbstractSet;Lgn2;)V

    .line 148
    .line 149
    .line 150
    move-object v8, v3

    .line 151
    new-instance v0, Ld0;

    .line 152
    .line 153
    move-object v3, v6

    .line 154
    const/4 v6, 0x0

    .line 155
    const/16 v7, 0x15

    .line 156
    .line 157
    const/4 v1, 0x1

    .line 158
    const-string v4, "searchMethodsInSupertypesWithoutBuiltinMagic"

    .line 159
    .line 160
    const-string v5, "searchMethodsInSupertypesWithoutBuiltinMagic(Lorg/jetbrains/kotlin/name/Name;)Ljava/util/Collection;"

    .line 161
    .line 162
    move-object v2, p0

    .line 163
    invoke-direct/range {v0 .. v7}, Ld0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 164
    .line 165
    .line 166
    move-object v1, p2

    .line 167
    move-object v5, v0

    .line 168
    move-object v0, v2

    .line 169
    move-object v3, v8

    .line 170
    move-object v4, v9

    .line 171
    move-object v2, p1

    .line 172
    invoke-virtual/range {v0 .. v5}, Lt44;->x(Lv15;Ljava/util/LinkedHashSet;Ljava/util/LinkedHashSet;Ljava/util/AbstractSet;Lgn2;)V

    .line 173
    .line 174
    .line 175
    new-instance v3, Ljava/util/ArrayList;

    .line 176
    .line 177
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 178
    .line 179
    .line 180
    invoke-interface {v11}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 181
    .line 182
    .line 183
    move-result-object v5

    .line 184
    :cond_6
    :goto_3
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 185
    .line 186
    .line 187
    move-result v6

    .line 188
    if-eqz v6, :cond_7

    .line 189
    .line 190
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 191
    .line 192
    .line 193
    move-result-object v6

    .line 194
    move-object v7, v6

    .line 195
    check-cast v7, Lq97;

    .line 196
    .line 197
    invoke-virtual {p0, v7}, Lt44;->L(Lq97;)Z

    .line 198
    .line 199
    .line 200
    move-result v7

    .line 201
    if-eqz v7, :cond_6

    .line 202
    .line 203
    invoke-virtual {v3, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 204
    .line 205
    .line 206
    goto :goto_3

    .line 207
    :cond_7
    invoke-static {v3, v4}, Lwv0;->H0(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 208
    .line 209
    .line 210
    move-result-object v3

    .line 211
    const/4 v4, 0x1

    .line 212
    invoke-virtual {p0, p1, p2, v3, v4}, Lt44;->w(Ljava/util/LinkedHashSet;Lv15;Ljava/util/ArrayList;Z)V

    .line 213
    .line 214
    .line 215
    return-void
.end method

.method public final n(Lv15;Ljava/util/ArrayList;)V
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v2, p2

    .line 4
    .line 5
    iget-object v1, v0, Lt44;->o:Lta6;

    .line 6
    .line 7
    iget-object v1, v1, Lta6;->a:Ljava/lang/Class;

    .line 8
    .line 9
    invoke-virtual {v1}, Ljava/lang/Class;->isAnnotation()Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    const/4 v3, 0x0

    .line 14
    iget-object v4, v0, Lf54;->b:Lz47;

    .line 15
    .line 16
    const/4 v5, 0x0

    .line 17
    if-eqz v1, :cond_1

    .line 18
    .line 19
    iget-object v1, v0, Lf54;->e:Lte4;

    .line 20
    .line 21
    invoke-virtual {v1}, Lte4;->invoke()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    check-cast v1, Lld1;

    .line 26
    .line 27
    move-object/from16 v6, p1

    .line 28
    .line 29
    invoke-interface {v1, v6}, Lld1;->c(Lv15;)Ljava/util/Collection;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    check-cast v1, Ljava/lang/Iterable;

    .line 34
    .line 35
    invoke-static {v1}, Lwv0;->P0(Ljava/lang/Iterable;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    check-cast v1, Lcb6;

    .line 40
    .line 41
    if-nez v1, :cond_0

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_0
    invoke-static {v4, v1}, Lhi5;->w0(Lz47;Lvj3;)Ln44;

    .line 45
    .line 46
    .line 47
    move-result-object v8

    .line 48
    invoke-virtual {v1}, Lbb6;->e()Ll5;

    .line 49
    .line 50
    .line 51
    move-result-object v7

    .line 52
    invoke-static {v7}, Ls08;->k(Ll5;)Lfl1;

    .line 53
    .line 54
    .line 55
    move-result-object v9

    .line 56
    invoke-virtual {v1}, Lbb6;->c()Lv15;

    .line 57
    .line 58
    .line 59
    move-result-object v11

    .line 60
    invoke-static {v1}, Llh4;->Z0(Lfk3;)Lhr6;

    .line 61
    .line 62
    .line 63
    move-result-object v12

    .line 64
    const/4 v13, 0x0

    .line 65
    iget-object v7, v0, Lt44;->n:Lsx4;

    .line 66
    .line 67
    const/4 v10, 0x0

    .line 68
    invoke-static/range {v7 .. v13}, Lgl3;->P0(Led1;Ln44;Lfl1;ZLv15;Lhr6;Z)Lgl3;

    .line 69
    .line 70
    .line 71
    move-result-object v14

    .line 72
    sget-object v7, Loy1;->f0:Lrm;

    .line 73
    .line 74
    invoke-static {v14, v7}, Lz91;->s(Lfx5;Lsm;)Lhx5;

    .line 75
    .line 76
    .line 77
    move-result-object v7

    .line 78
    invoke-virtual {v14, v7, v5, v5, v5}, Lgx5;->L0(Lhx5;Ltx5;Ly82;Ly82;)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 82
    .line 83
    .line 84
    iget-object v8, v4, Lz47;->f0:Ljava/lang/Object;

    .line 85
    .line 86
    check-cast v8, Lg44;

    .line 87
    .line 88
    iget-object v9, v4, Lz47;->Y:Ljava/lang/Object;

    .line 89
    .line 90
    check-cast v9, Lc6;

    .line 91
    .line 92
    new-instance v10, Lxm0;

    .line 93
    .line 94
    invoke-direct {v10, v4, v14, v1, v3}, Lxm0;-><init>(Lz47;Led1;Lpl3;I)V

    .line 95
    .line 96
    .line 97
    new-instance v11, Lz47;

    .line 98
    .line 99
    invoke-direct {v11, v9, v10, v8}, Lz47;-><init>(Lc6;Lki8;Lg44;)V

    .line 100
    .line 101
    .line 102
    invoke-static {v1, v11}, Lf54;->l(Lcb6;Lz47;)Lt14;

    .line 103
    .line 104
    .line 105
    move-result-object v15

    .line 106
    invoke-virtual {v0}, Lt44;->p()Li44;

    .line 107
    .line 108
    .line 109
    move-result-object v17

    .line 110
    const/16 v18, 0x0

    .line 111
    .line 112
    sget-object v16, Ld02;->X:Ld02;

    .line 113
    .line 114
    move-object/from16 v19, v16

    .line 115
    .line 116
    invoke-virtual/range {v14 .. v19}, Lgx5;->O0(Lt14;Ljava/util/List;Li44;Li44;Ljava/util/List;)V

    .line 117
    .line 118
    .line 119
    iput-object v15, v7, Lhx5;->q0:Lt14;

    .line 120
    .line 121
    invoke-virtual {v2, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 122
    .line 123
    .line 124
    goto :goto_0

    .line 125
    :cond_1
    move-object/from16 v6, p1

    .line 126
    .line 127
    :goto_0
    invoke-virtual/range {p0 .. p1}, Lt44;->J(Lv15;)Ljava/util/Set;

    .line 128
    .line 129
    .line 130
    move-result-object v1

    .line 131
    invoke-interface {v1}, Ljava/util/Set;->isEmpty()Z

    .line 132
    .line 133
    .line 134
    move-result v7

    .line 135
    if-eqz v7, :cond_2

    .line 136
    .line 137
    return-void

    .line 138
    :cond_2
    new-instance v7, Lpc7;

    .line 139
    .line 140
    invoke-direct {v7}, Lh2;-><init>()V

    .line 141
    .line 142
    .line 143
    new-instance v8, Lpc7;

    .line 144
    .line 145
    invoke-direct {v8}, Lh2;-><init>()V

    .line 146
    .line 147
    .line 148
    new-instance v9, Ls44;

    .line 149
    .line 150
    invoke-direct {v9, v0, v3}, Ls44;-><init>(Lt44;B)V

    .line 151
    .line 152
    .line 153
    invoke-virtual {v0, v1, v2, v7, v9}, Lt44;->y(Ljava/util/Set;Ljava/util/AbstractCollection;Lpc7;Lgn2;)V

    .line 154
    .line 155
    .line 156
    invoke-static {v1, v7}, Lq57;->Y(Ljava/util/Set;Ljava/lang/Iterable;)Ljava/util/Set;

    .line 157
    .line 158
    .line 159
    move-result-object v3

    .line 160
    new-instance v7, Ls44;

    .line 161
    .line 162
    const/4 v9, 0x1

    .line 163
    invoke-direct {v7, v0, v9}, Ls44;-><init>(Lt44;B)V

    .line 164
    .line 165
    .line 166
    invoke-virtual {v0, v3, v8, v5, v7}, Lt44;->y(Ljava/util/Set;Ljava/util/AbstractCollection;Lpc7;Lgn2;)V

    .line 167
    .line 168
    .line 169
    invoke-static {v1, v8}, Lq57;->Z(Ljava/util/Set;Ljava/lang/Iterable;)Ljava/util/LinkedHashSet;

    .line 170
    .line 171
    .line 172
    move-result-object v1

    .line 173
    iget-object v3, v4, Lz47;->Y:Ljava/lang/Object;

    .line 174
    .line 175
    check-cast v3, Lc6;

    .line 176
    .line 177
    sget-object v4, Lqe4;->r0:Lqe4;

    .line 178
    .line 179
    iget-object v3, v3, Lc6;->Z:Ljava/lang/Object;

    .line 180
    .line 181
    check-cast v3, Lp45;

    .line 182
    .line 183
    check-cast v3, Lq45;

    .line 184
    .line 185
    iget-object v5, v3, Lq45;->d:Lhf5;

    .line 186
    .line 187
    iget-object v3, v0, Lt44;->n:Lsx4;

    .line 188
    .line 189
    move-object v0, v6

    .line 190
    invoke-static/range {v0 .. v5}, Lch3;->Q(Lv15;Ljava/util/AbstractCollection;Ljava/util/Collection;Lsx4;Ll32;Lhf5;)Ljava/util/LinkedHashSet;

    .line 191
    .line 192
    .line 193
    move-result-object v0

    .line 194
    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 195
    .line 196
    .line 197
    return-void
.end method

.method public final o(Lpk1;)Ljava/util/Set;
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p1, p0, Lt44;->o:Lta6;

    .line 5
    .line 6
    iget-object p1, p1, Lta6;->a:Ljava/lang/Class;

    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/Class;->isAnnotation()Z

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    if-eqz p1, :cond_0

    .line 13
    .line 14
    invoke-virtual {p0}, Lf54;->c()Ljava/util/Set;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    return-object p0

    .line 19
    :cond_0
    new-instance p1, Ljava/util/LinkedHashSet;

    .line 20
    .line 21
    iget-object v0, p0, Lf54;->e:Lte4;

    .line 22
    .line 23
    invoke-virtual {v0}, Lte4;->invoke()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    check-cast v0, Lld1;

    .line 28
    .line 29
    invoke-interface {v0}, Lld1;->f()Ljava/util/Set;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    check-cast v0, Ljava/util/Collection;

    .line 34
    .line 35
    invoke-direct {p1, v0}, Ljava/util/LinkedHashSet;-><init>(Ljava/util/Collection;)V

    .line 36
    .line 37
    .line 38
    iget-object p0, p0, Lt44;->n:Lsx4;

    .line 39
    .line 40
    invoke-interface {p0}, Lot0;->l()Llh8;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    invoke-interface {p0}, Llh8;->c()Ljava/util/Collection;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 49
    .line 50
    .line 51
    check-cast p0, Ljava/lang/Iterable;

    .line 52
    .line 53
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 58
    .line 59
    .line 60
    move-result v0

    .line 61
    if-eqz v0, :cond_1

    .line 62
    .line 63
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    check-cast v0, Lt14;

    .line 68
    .line 69
    invoke-virtual {v0}, Lt14;->K()Let4;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    invoke-interface {v0}, Let4;->g()Ljava/util/Set;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    check-cast v0, Ljava/lang/Iterable;

    .line 78
    .line 79
    invoke-static {p1, v0}, Lbw0;->d0(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 80
    .line 81
    .line 82
    goto :goto_0

    .line 83
    :cond_1
    return-object p1
.end method

.method public final p()Li44;
    .locals 1

    .line 1
    iget-object p0, p0, Lt44;->n:Lsx4;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    sget v0, Lbl1;->a:I

    .line 6
    .line 7
    invoke-virtual {p0}, Lsx4;->p0()Li44;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0

    .line 12
    :cond_0
    const/4 p0, 0x0

    .line 13
    invoke-static {p0}, Lbl1;->a(I)V

    .line 14
    .line 15
    .line 16
    const/4 p0, 0x0

    .line 17
    throw p0
.end method

.method public final q()Led1;
    .locals 0

    .line 1
    iget-object p0, p0, Lt44;->n:Lsx4;

    .line 2
    .line 3
    return-object p0
.end method

.method public final r(Ldl3;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lt44;->o:Lta6;

    .line 2
    .line 3
    iget-object v0, v0, Lta6;->a:Ljava/lang/Class;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Class;->isAnnotation()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    const/4 p0, 0x0

    .line 12
    return p0

    .line 13
    :cond_0
    invoke-virtual {p0, p1}, Lt44;->L(Lq97;)Z

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    return p0
.end method

.method public final s(Lcb6;Ljava/util/ArrayList;Lt14;Ljava/util/List;)Le54;
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p1, p0, Lf54;->b:Lz47;

    .line 5
    .line 6
    iget-object p1, p1, Lz47;->Y:Ljava/lang/Object;

    .line 7
    .line 8
    iget-object p0, p0, Lt44;->n:Lsx4;

    .line 9
    .line 10
    const/4 p1, 0x0

    .line 11
    const/4 v0, 0x1

    .line 12
    if-eqz p0, :cond_1

    .line 13
    .line 14
    sget-object p0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 15
    .line 16
    if-eqz p0, :cond_0

    .line 17
    .line 18
    new-instance p1, Le54;

    .line 19
    .line 20
    invoke-direct {p1, p3, p4, p2, p0}, Le54;-><init>(Lt14;Ljava/util/List;Ljava/util/ArrayList;Ljava/util/List;)V

    .line 21
    .line 22
    .line 23
    return-object p1

    .line 24
    :cond_0
    const/4 p0, 0x3

    .line 25
    new-array p0, p0, [Ljava/lang/Object;

    .line 26
    .line 27
    const-string p2, "signatureErrors"

    .line 28
    .line 29
    const/4 p3, 0x0

    .line 30
    aput-object p2, p0, p3

    .line 31
    .line 32
    const-string p2, "kotlin/reflect/jvm/internal/impl/load/java/components/SignaturePropagator$PropagatedSignature"

    .line 33
    .line 34
    aput-object p2, p0, v0

    .line 35
    .line 36
    const-string p2, "<init>"

    .line 37
    .line 38
    const/4 p3, 0x2

    .line 39
    aput-object p2, p0, p3

    .line 40
    .line 41
    const-string p2, "Argument for @NotNull parameter \'%s\' of %s.%s must not be null"

    .line 42
    .line 43
    invoke-static {p2, p0}, Lkp5;->n(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    return-object p1

    .line 47
    :cond_1
    invoke-static {v0}, Lz68;->a(I)V

    .line 48
    .line 49
    .line 50
    throw p1
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "Lazy Java member scope for "

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object p0, p0, Lt44;->o:Lta6;

    .line 9
    .line 10
    invoke-virtual {p0}, Lta6;->c()Lfk2;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    return-object p0
.end method

.method public final v(Ljava/util/ArrayList;Lyj3;ILcb6;Lt14;Lt14;)V
    .locals 12

    .line 1
    move-object/from16 v0, p5

    .line 2
    .line 3
    move-object/from16 v1, p6

    .line 4
    .line 5
    sget-object v4, Loy1;->f0:Lrm;

    .line 6
    .line 7
    invoke-virtual/range {p4 .. p4}, Lbb6;->c()Lv15;

    .line 8
    .line 9
    .line 10
    move-result-object v5

    .line 11
    const/4 v2, 0x0

    .line 12
    if-eqz v0, :cond_7

    .line 13
    .line 14
    const/4 v3, 0x0

    .line 15
    invoke-static {v0, v3}, Lcj8;->g(Lt14;Z)Lmo8;

    .line 16
    .line 17
    .line 18
    move-result-object v6

    .line 19
    move-object/from16 v0, p4

    .line 20
    .line 21
    iget-object v7, v0, Lcb6;->a:Ljava/lang/reflect/Method;

    .line 22
    .line 23
    invoke-virtual {v7}, Ljava/lang/reflect/Method;->getDefaultValue()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v7

    .line 27
    if-eqz v7, :cond_4

    .line 28
    .line 29
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    move-result-object v8

    .line 33
    sget-object v9, Lia6;->a:Ljava/util/List;

    .line 34
    .line 35
    const-class v9, Ljava/lang/Enum;

    .line 36
    .line 37
    invoke-virtual {v9, v8}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 38
    .line 39
    .line 40
    move-result v8

    .line 41
    if-eqz v8, :cond_0

    .line 42
    .line 43
    new-instance v8, Lya6;

    .line 44
    .line 45
    check-cast v7, Ljava/lang/Enum;

    .line 46
    .line 47
    invoke-direct {v8, v2, v7}, Lya6;-><init>(Lv15;Ljava/lang/Enum;)V

    .line 48
    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_0
    instance-of v8, v7, Ljava/lang/annotation/Annotation;

    .line 52
    .line 53
    if-eqz v8, :cond_1

    .line 54
    .line 55
    new-instance v8, Lla6;

    .line 56
    .line 57
    check-cast v7, Ljava/lang/annotation/Annotation;

    .line 58
    .line 59
    invoke-direct {v8, v2, v7}, Lla6;-><init>(Lv15;Ljava/lang/annotation/Annotation;)V

    .line 60
    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_1
    instance-of v8, v7, [Ljava/lang/Object;

    .line 64
    .line 65
    if-eqz v8, :cond_2

    .line 66
    .line 67
    new-instance v8, Lma6;

    .line 68
    .line 69
    check-cast v7, [Ljava/lang/Object;

    .line 70
    .line 71
    invoke-direct {v8, v2, v7}, Lma6;-><init>(Lv15;[Ljava/lang/Object;)V

    .line 72
    .line 73
    .line 74
    goto :goto_0

    .line 75
    :cond_2
    instance-of v8, v7, Ljava/lang/Class;

    .line 76
    .line 77
    if-eqz v8, :cond_3

    .line 78
    .line 79
    new-instance v8, Lua6;

    .line 80
    .line 81
    check-cast v7, Ljava/lang/Class;

    .line 82
    .line 83
    invoke-direct {v8, v2, v7}, Lua6;-><init>(Lv15;Ljava/lang/Class;)V

    .line 84
    .line 85
    .line 86
    goto :goto_0

    .line 87
    :cond_3
    new-instance v8, Lab6;

    .line 88
    .line 89
    invoke-direct {v8, v2, v7}, Lab6;-><init>(Lv15;Ljava/lang/Object;)V

    .line 90
    .line 91
    .line 92
    goto :goto_0

    .line 93
    :cond_4
    move-object v8, v2

    .line 94
    :goto_0
    if-eqz v8, :cond_5

    .line 95
    .line 96
    const/4 v7, 0x1

    .line 97
    goto :goto_1

    .line 98
    :cond_5
    move v7, v3

    .line 99
    :goto_1
    if-eqz v1, :cond_6

    .line 100
    .line 101
    invoke-static {v1, v3}, Lcj8;->g(Lt14;Z)Lmo8;

    .line 102
    .line 103
    .line 104
    move-result-object v2

    .line 105
    :cond_6
    move-object v10, v2

    .line 106
    iget-object p0, p0, Lf54;->b:Lz47;

    .line 107
    .line 108
    iget-object p0, p0, Lz47;->Y:Ljava/lang/Object;

    .line 109
    .line 110
    invoke-static {v0}, Llh4;->Z0(Lfk3;)Lhr6;

    .line 111
    .line 112
    .line 113
    move-result-object v11

    .line 114
    new-instance v0, Lot8;

    .line 115
    .line 116
    const/4 v2, 0x0

    .line 117
    const/4 v8, 0x0

    .line 118
    const/4 v9, 0x0

    .line 119
    move-object v1, p2

    .line 120
    move v3, p3

    .line 121
    invoke-direct/range {v0 .. v11}, Lot8;-><init>(Ljd0;Lot8;ILsm;Lv15;Lt14;ZZZLt14;Lke7;)V

    .line 122
    .line 123
    .line 124
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 125
    .line 126
    .line 127
    return-void

    .line 128
    :cond_7
    const/4 p0, 0x2

    .line 129
    invoke-static {p0}, Lcj8;->a(I)V

    .line 130
    .line 131
    .line 132
    throw v2
.end method

.method public final w(Ljava/util/LinkedHashSet;Lv15;Ljava/util/ArrayList;Z)V
    .locals 7

    .line 1
    iget-object v0, p0, Lf54;->b:Lz47;

    .line 2
    .line 3
    iget-object v0, v0, Lz47;->Y:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, Lc6;

    .line 6
    .line 7
    sget-object v5, Lqe4;->r0:Lqe4;

    .line 8
    .line 9
    iget-object v0, v0, Lc6;->Z:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v0, Lp45;

    .line 12
    .line 13
    check-cast v0, Lq45;

    .line 14
    .line 15
    iget-object v6, v0, Lq45;->d:Lhf5;

    .line 16
    .line 17
    iget-object v4, p0, Lt44;->n:Lsx4;

    .line 18
    .line 19
    move-object v3, p1

    .line 20
    move-object v1, p2

    .line 21
    move-object v2, p3

    .line 22
    invoke-static/range {v1 .. v6}, Lch3;->Q(Lv15;Ljava/util/AbstractCollection;Ljava/util/Collection;Lsx4;Ll32;Lhf5;)Ljava/util/LinkedHashSet;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    if-nez p4, :cond_0

    .line 27
    .line 28
    invoke-interface {v3, p0}, Ljava/util/Collection;->addAll(Ljava/util/Collection;)Z

    .line 29
    .line 30
    .line 31
    return-void

    .line 32
    :cond_0
    invoke-static {v3, p0}, Lwv0;->H0(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    new-instance p2, Ljava/util/ArrayList;

    .line 37
    .line 38
    const/16 p3, 0xa

    .line 39
    .line 40
    invoke-static {p0, p3}, Lxv0;->Z(Ljava/lang/Iterable;I)I

    .line 41
    .line 42
    .line 43
    move-result p3

    .line 44
    invoke-direct {p2, p3}, Ljava/util/ArrayList;-><init>(I)V

    .line 45
    .line 46
    .line 47
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 52
    .line 53
    .line 54
    move-result p3

    .line 55
    if-eqz p3, :cond_2

    .line 56
    .line 57
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object p3

    .line 61
    check-cast p3, Lq97;

    .line 62
    .line 63
    invoke-static {p3}, Lgv3;->B(Lld0;)Lld0;

    .line 64
    .line 65
    .line 66
    move-result-object p4

    .line 67
    check-cast p4, Lq97;

    .line 68
    .line 69
    if-nez p4, :cond_1

    .line 70
    .line 71
    goto :goto_1

    .line 72
    :cond_1
    invoke-static {p3, p4, p1}, Lt44;->A(Lq97;Lho2;Ljava/util/AbstractCollection;)Lq97;

    .line 73
    .line 74
    .line 75
    move-result-object p3

    .line 76
    :goto_1
    invoke-virtual {p2, p3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 77
    .line 78
    .line 79
    goto :goto_0

    .line 80
    :cond_2
    invoke-interface {v3, p2}, Ljava/util/Collection;->addAll(Ljava/util/Collection;)Z

    .line 81
    .line 82
    .line 83
    return-void
.end method

.method public final x(Lv15;Ljava/util/LinkedHashSet;Ljava/util/LinkedHashSet;Ljava/util/AbstractSet;Lgn2;)V
    .locals 8

    .line 1
    invoke-interface {p3}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 2
    .line 3
    .line 4
    move-result-object p3

    .line 5
    :cond_0
    :goto_0
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_11

    .line 10
    .line 11
    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    check-cast v0, Lq97;

    .line 16
    .line 17
    invoke-static {v0}, Lgv3;->A(Lld0;)Lld0;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    check-cast v1, Lq97;

    .line 22
    .line 23
    const/4 v2, 0x0

    .line 24
    if-nez v1, :cond_2

    .line 25
    .line 26
    :cond_1
    move-object v1, v2

    .line 27
    goto :goto_1

    .line 28
    :cond_2
    invoke-static {v1}, Lgv3;->y(Lho2;)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v3

    .line 32
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    invoke-static {v3}, Lv15;->e(Ljava/lang/String;)Lv15;

    .line 36
    .line 37
    .line 38
    move-result-object v3

    .line 39
    invoke-interface {p5, v3}, Lgn2;->B(Ljava/lang/Object;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v3

    .line 43
    check-cast v3, Ljava/util/Collection;

    .line 44
    .line 45
    invoke-interface {v3}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 46
    .line 47
    .line 48
    move-result-object v3

    .line 49
    :cond_3
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 50
    .line 51
    .line 52
    move-result v4

    .line 53
    if-eqz v4, :cond_1

    .line 54
    .line 55
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v4

    .line 59
    check-cast v4, Lq97;

    .line 60
    .line 61
    invoke-interface {v4}, Lho2;->i0()Lgo2;

    .line 62
    .line 63
    .line 64
    move-result-object v4

    .line 65
    invoke-interface {v4, p1}, Lgo2;->x(Lv15;)Lgo2;

    .line 66
    .line 67
    .line 68
    invoke-interface {v4}, Lgo2;->z()Lgo2;

    .line 69
    .line 70
    .line 71
    invoke-interface {v4}, Lgo2;->g()Lgo2;

    .line 72
    .line 73
    .line 74
    invoke-interface {v4}, Lgo2;->build()Lho2;

    .line 75
    .line 76
    .line 77
    move-result-object v4

    .line 78
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 79
    .line 80
    .line 81
    check-cast v4, Lq97;

    .line 82
    .line 83
    invoke-static {v1, v4}, Lt44;->E(Lq97;Lq97;)Z

    .line 84
    .line 85
    .line 86
    move-result v5

    .line 87
    if-eqz v5, :cond_3

    .line 88
    .line 89
    invoke-static {v4, v1, p2}, Lt44;->A(Lq97;Lho2;Ljava/util/AbstractCollection;)Lq97;

    .line 90
    .line 91
    .line 92
    move-result-object v1

    .line 93
    :goto_1
    if-eqz v1, :cond_4

    .line 94
    .line 95
    invoke-interface {p4, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 96
    .line 97
    .line 98
    :cond_4
    invoke-static {v0}, Lta0;->a(Lho2;)Lho2;

    .line 99
    .line 100
    .line 101
    move-result-object v1

    .line 102
    if-nez v1, :cond_6

    .line 103
    .line 104
    :cond_5
    move-object v1, v2

    .line 105
    goto/16 :goto_6

    .line 106
    .line 107
    :cond_6
    move-object v3, v1

    .line 108
    check-cast v3, Lfd1;

    .line 109
    .line 110
    invoke-virtual {v3}, Lfd1;->getName()Lv15;

    .line 111
    .line 112
    .line 113
    move-result-object v3

    .line 114
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 115
    .line 116
    .line 117
    invoke-interface {p5, v3}, Lgn2;->B(Ljava/lang/Object;)Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    move-result-object v3

    .line 121
    check-cast v3, Ljava/lang/Iterable;

    .line 122
    .line 123
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 124
    .line 125
    .line 126
    move-result-object v3

    .line 127
    :cond_7
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 128
    .line 129
    .line 130
    move-result v4

    .line 131
    if-eqz v4, :cond_8

    .line 132
    .line 133
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    move-result-object v4

    .line 137
    move-object v5, v4

    .line 138
    check-cast v5, Lq97;

    .line 139
    .line 140
    invoke-static {v5, v1}, Lt44;->K(Lq97;Lho2;)Z

    .line 141
    .line 142
    .line 143
    move-result v5

    .line 144
    if-eqz v5, :cond_7

    .line 145
    .line 146
    goto :goto_2

    .line 147
    :cond_8
    move-object v4, v2

    .line 148
    :goto_2
    check-cast v4, Lq97;

    .line 149
    .line 150
    if-eqz v4, :cond_a

    .line 151
    .line 152
    invoke-interface {v4}, Lho2;->i0()Lgo2;

    .line 153
    .line 154
    .line 155
    move-result-object v3

    .line 156
    invoke-interface {v1}, Ljd0;->L()Ljava/util/List;

    .line 157
    .line 158
    .line 159
    move-result-object v5

    .line 160
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 161
    .line 162
    .line 163
    new-instance v6, Ljava/util/ArrayList;

    .line 164
    .line 165
    const/16 v7, 0xa

    .line 166
    .line 167
    invoke-static {v5, v7}, Lxv0;->Z(Ljava/lang/Iterable;I)I

    .line 168
    .line 169
    .line 170
    move-result v7

    .line 171
    invoke-direct {v6, v7}, Ljava/util/ArrayList;-><init>(I)V

    .line 172
    .line 173
    .line 174
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 175
    .line 176
    .line 177
    move-result-object v5

    .line 178
    :goto_3
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 179
    .line 180
    .line 181
    move-result v7

    .line 182
    if-eqz v7, :cond_9

    .line 183
    .line 184
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 185
    .line 186
    .line 187
    move-result-object v7

    .line 188
    check-cast v7, Lot8;

    .line 189
    .line 190
    invoke-virtual {v7}, Lqt8;->c()Lt14;

    .line 191
    .line 192
    .line 193
    move-result-object v7

    .line 194
    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 195
    .line 196
    .line 197
    goto :goto_3

    .line 198
    :cond_9
    invoke-virtual {v4}, Ljo2;->L()Ljava/util/List;

    .line 199
    .line 200
    .line 201
    move-result-object v4

    .line 202
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 203
    .line 204
    .line 205
    invoke-static {v6, v4, v1}, Lxt7;->b(Ljava/util/ArrayList;Ljava/util/List;Lho2;)Ljava/util/ArrayList;

    .line 206
    .line 207
    .line 208
    move-result-object v4

    .line 209
    invoke-interface {v3, v4}, Lgo2;->a(Ljava/util/List;)Lgo2;

    .line 210
    .line 211
    .line 212
    invoke-interface {v3}, Lgo2;->z()Lgo2;

    .line 213
    .line 214
    .line 215
    invoke-interface {v3}, Lgo2;->g()Lgo2;

    .line 216
    .line 217
    .line 218
    invoke-interface {v3}, Lgo2;->h()Lgo2;

    .line 219
    .line 220
    .line 221
    invoke-interface {v3}, Lgo2;->build()Lho2;

    .line 222
    .line 223
    .line 224
    move-result-object v3

    .line 225
    check-cast v3, Lq97;

    .line 226
    .line 227
    goto :goto_4

    .line 228
    :cond_a
    move-object v3, v2

    .line 229
    :goto_4
    if-eqz v3, :cond_5

    .line 230
    .line 231
    invoke-virtual {p0, v3}, Lt44;->L(Lq97;)Z

    .line 232
    .line 233
    .line 234
    move-result v4

    .line 235
    if-eqz v4, :cond_b

    .line 236
    .line 237
    goto :goto_5

    .line 238
    :cond_b
    move-object v3, v2

    .line 239
    :goto_5
    if-eqz v3, :cond_5

    .line 240
    .line 241
    invoke-static {v3, v1, p2}, Lt44;->A(Lq97;Lho2;Ljava/util/AbstractCollection;)Lq97;

    .line 242
    .line 243
    .line 244
    move-result-object v1

    .line 245
    :goto_6
    if-eqz v1, :cond_c

    .line 246
    .line 247
    invoke-interface {p4, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 248
    .line 249
    .line 250
    :cond_c
    invoke-interface {v0}, Lho2;->h()Z

    .line 251
    .line 252
    .line 253
    move-result v1

    .line 254
    if-nez v1, :cond_d

    .line 255
    .line 256
    goto :goto_8

    .line 257
    :cond_d
    invoke-virtual {v0}, Lfd1;->getName()Lv15;

    .line 258
    .line 259
    .line 260
    move-result-object v1

    .line 261
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 262
    .line 263
    .line 264
    invoke-interface {p5, v1}, Lgn2;->B(Ljava/lang/Object;)Ljava/lang/Object;

    .line 265
    .line 266
    .line 267
    move-result-object v1

    .line 268
    check-cast v1, Ljava/lang/Iterable;

    .line 269
    .line 270
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 271
    .line 272
    .line 273
    move-result-object v1

    .line 274
    :cond_e
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 275
    .line 276
    .line 277
    move-result v3

    .line 278
    if-eqz v3, :cond_10

    .line 279
    .line 280
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 281
    .line 282
    .line 283
    move-result-object v3

    .line 284
    check-cast v3, Lq97;

    .line 285
    .line 286
    invoke-static {v3}, Lt44;->B(Lq97;)Lq97;

    .line 287
    .line 288
    .line 289
    move-result-object v3

    .line 290
    if-eqz v3, :cond_f

    .line 291
    .line 292
    invoke-static {v3, v0}, Lt44;->D(Lho2;Lho2;)Z

    .line 293
    .line 294
    .line 295
    move-result v4

    .line 296
    if-eqz v4, :cond_f

    .line 297
    .line 298
    goto :goto_7

    .line 299
    :cond_f
    move-object v3, v2

    .line 300
    :goto_7
    if-eqz v3, :cond_e

    .line 301
    .line 302
    move-object v2, v3

    .line 303
    :cond_10
    :goto_8
    if-eqz v2, :cond_0

    .line 304
    .line 305
    invoke-interface {p4, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 306
    .line 307
    .line 308
    goto/16 :goto_0

    .line 309
    .line 310
    :cond_11
    return-void
.end method

.method public final y(Ljava/util/Set;Ljava/util/AbstractCollection;Lpc7;Lgn2;)V
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p3

    .line 4
    .line 5
    move-object/from16 v2, p4

    .line 6
    .line 7
    invoke-interface/range {p1 .. p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 8
    .line 9
    .line 10
    move-result-object v3

    .line 11
    :cond_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 12
    .line 13
    .line 14
    move-result v4

    .line 15
    if-eqz v4, :cond_7

    .line 16
    .line 17
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v4

    .line 21
    check-cast v4, Lfx5;

    .line 22
    .line 23
    invoke-virtual {v0, v4, v2}, Lt44;->C(Lfx5;Lgn2;)Z

    .line 24
    .line 25
    .line 26
    move-result v5

    .line 27
    if-nez v5, :cond_1

    .line 28
    .line 29
    const/4 v6, 0x0

    .line 30
    goto/16 :goto_4

    .line 31
    .line 32
    :cond_1
    invoke-virtual {v0, v4, v2}, Lt44;->G(Lfx5;Lgn2;)Lq97;

    .line 33
    .line 34
    .line 35
    move-result-object v5

    .line 36
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    invoke-interface {v4}, Lpt8;->R()Z

    .line 40
    .line 41
    .line 42
    move-result v7

    .line 43
    if-eqz v7, :cond_2

    .line 44
    .line 45
    invoke-static {v4, v2}, Lt44;->H(Lfx5;Lgn2;)Lq97;

    .line 46
    .line 47
    .line 48
    move-result-object v7

    .line 49
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 50
    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_2
    const/4 v7, 0x0

    .line 54
    :goto_0
    if-eqz v7, :cond_3

    .line 55
    .line 56
    invoke-virtual {v7}, Ljo2;->m()Lfx4;

    .line 57
    .line 58
    .line 59
    invoke-virtual {v5}, Ljo2;->m()Lfx4;

    .line 60
    .line 61
    .line 62
    :cond_3
    new-instance v8, Lkk3;

    .line 63
    .line 64
    iget-object v9, v0, Lt44;->n:Lsx4;

    .line 65
    .line 66
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 67
    .line 68
    .line 69
    sget-object v10, Loy1;->f0:Lrm;

    .line 70
    .line 71
    invoke-virtual {v5}, Ljo2;->m()Lfx4;

    .line 72
    .line 73
    .line 74
    move-result-object v11

    .line 75
    invoke-virtual {v5}, Ljo2;->e()Lfl1;

    .line 76
    .line 77
    .line 78
    move-result-object v12

    .line 79
    const/4 v13, 0x0

    .line 80
    if-eqz v7, :cond_4

    .line 81
    .line 82
    const/4 v14, 0x1

    .line 83
    goto :goto_1

    .line 84
    :cond_4
    move v14, v13

    .line 85
    :goto_1
    invoke-interface {v4}, Led1;->getName()Lv15;

    .line 86
    .line 87
    .line 88
    move-result-object v15

    .line 89
    move/from16 v16, v13

    .line 90
    .line 91
    move v13, v14

    .line 92
    move-object v14, v15

    .line 93
    invoke-virtual {v5}, Lhd1;->getSource()Lke7;

    .line 94
    .line 95
    .line 96
    move-result-object v15

    .line 97
    const/16 v18, 0x0

    .line 98
    .line 99
    const/16 v19, 0x0

    .line 100
    .line 101
    move/from16 v17, v16

    .line 102
    .line 103
    const/16 v16, 0x0

    .line 104
    .line 105
    move/from16 v20, v17

    .line 106
    .line 107
    const/16 v17, 0x1

    .line 108
    .line 109
    move/from16 v6, v20

    .line 110
    .line 111
    invoke-direct/range {v8 .. v19}, Lgl3;-><init>(Led1;Lsm;Lfx4;Lfl1;ZLv15;Lke7;Lfx5;IZLqg5;)V

    .line 112
    .line 113
    .line 114
    iget-object v9, v5, Ljo2;->k0:Lt14;

    .line 115
    .line 116
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 117
    .line 118
    .line 119
    invoke-virtual {v0}, Lt44;->p()Li44;

    .line 120
    .line 121
    .line 122
    move-result-object v11

    .line 123
    const/4 v12, 0x0

    .line 124
    sget-object v10, Ld02;->X:Ld02;

    .line 125
    .line 126
    move-object v13, v10

    .line 127
    invoke-virtual/range {v8 .. v13}, Lgx5;->O0(Lt14;Ljava/util/List;Li44;Li44;Ljava/util/List;)V

    .line 128
    .line 129
    .line 130
    invoke-virtual {v5}, Lcw0;->getAnnotations()Lsm;

    .line 131
    .line 132
    .line 133
    move-result-object v9

    .line 134
    invoke-virtual {v5}, Lhd1;->getSource()Lke7;

    .line 135
    .line 136
    .line 137
    move-result-object v10

    .line 138
    invoke-static {v8, v9, v6, v10}, Lz91;->y(Lfx5;Lsm;ZLke7;)Lhx5;

    .line 139
    .line 140
    .line 141
    move-result-object v6

    .line 142
    iput-object v5, v6, Lcx5;->p0:Lho2;

    .line 143
    .line 144
    invoke-virtual {v8}, Lqt8;->c()Lt14;

    .line 145
    .line 146
    .line 147
    move-result-object v5

    .line 148
    invoke-virtual {v6, v5}, Lhx5;->J0(Lt14;)V

    .line 149
    .line 150
    .line 151
    if-eqz v7, :cond_6

    .line 152
    .line 153
    invoke-virtual {v7}, Ljo2;->L()Ljava/util/List;

    .line 154
    .line 155
    .line 156
    move-result-object v5

    .line 157
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 158
    .line 159
    .line 160
    invoke-static {v5}, Lwv0;->t0(Ljava/util/List;)Ljava/lang/Object;

    .line 161
    .line 162
    .line 163
    move-result-object v5

    .line 164
    check-cast v5, Lot8;

    .line 165
    .line 166
    if-eqz v5, :cond_5

    .line 167
    .line 168
    invoke-virtual {v7}, Lcw0;->getAnnotations()Lsm;

    .line 169
    .line 170
    .line 171
    move-result-object v9

    .line 172
    invoke-virtual {v5}, Lcw0;->getAnnotations()Lsm;

    .line 173
    .line 174
    .line 175
    move-result-object v10

    .line 176
    invoke-virtual {v7}, Ljo2;->e()Lfl1;

    .line 177
    .line 178
    .line 179
    move-result-object v12

    .line 180
    invoke-virtual {v7}, Lhd1;->getSource()Lke7;

    .line 181
    .line 182
    .line 183
    move-result-object v13

    .line 184
    const/4 v11, 0x0

    .line 185
    invoke-static/range {v8 .. v13}, Lz91;->A(Lfx5;Lsm;Lsm;ZLfl1;Lke7;)Ltx5;

    .line 186
    .line 187
    .line 188
    move-result-object v5

    .line 189
    iput-object v7, v5, Lcx5;->p0:Lho2;

    .line 190
    .line 191
    :goto_2
    const/4 v7, 0x0

    .line 192
    goto :goto_3

    .line 193
    :cond_5
    new-instance v0, Ljava/lang/AssertionError;

    .line 194
    .line 195
    new-instance v1, Ljava/lang/StringBuilder;

    .line 196
    .line 197
    const-string v2, "No parameter found for "

    .line 198
    .line 199
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 200
    .line 201
    .line 202
    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 203
    .line 204
    .line 205
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 206
    .line 207
    .line 208
    move-result-object v1

    .line 209
    invoke-direct {v0, v1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    .line 210
    .line 211
    .line 212
    throw v0

    .line 213
    :cond_6
    const/4 v5, 0x0

    .line 214
    goto :goto_2

    .line 215
    :goto_3
    invoke-virtual {v8, v6, v5, v7, v7}, Lgx5;->L0(Lhx5;Ltx5;Ly82;Ly82;)V

    .line 216
    .line 217
    .line 218
    move-object v6, v8

    .line 219
    :goto_4
    move-object/from16 v5, p2

    .line 220
    .line 221
    if-eqz v6, :cond_0

    .line 222
    .line 223
    invoke-interface {v5, v6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 224
    .line 225
    .line 226
    if-eqz v1, :cond_7

    .line 227
    .line 228
    invoke-virtual {v1, v4}, Lpc7;->add(Ljava/lang/Object;)Z

    .line 229
    .line 230
    .line 231
    :cond_7
    return-void
.end method

.method public final z()Ljava/util/Collection;
    .locals 2

    .line 1
    iget-boolean v0, p0, Lt44;->p:Z

    .line 2
    .line 3
    iget-object v1, p0, Lt44;->n:Lsx4;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-interface {v1}, Lot0;->l()Llh8;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    invoke-interface {p0}, Llh8;->c()Ljava/util/Collection;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    return-object p0

    .line 19
    :cond_0
    iget-object p0, p0, Lf54;->b:Lz47;

    .line 20
    .line 21
    iget-object p0, p0, Lz47;->Y:Ljava/lang/Object;

    .line 22
    .line 23
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    invoke-interface {v1}, Lot0;->l()Llh8;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    invoke-interface {p0}, Llh8;->c()Ljava/util/Collection;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    return-object p0
.end method
