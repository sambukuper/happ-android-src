.class public final Llm1;
.super Lv1;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public final o0:Ljl1;

.field public final p0:Lsz5;

.field public final q0:Lll1;


# direct methods
.method public constructor <init>(Ljl1;Lsz5;I)V
    .locals 11

    .line 1
    iget-object v0, p1, Ljl1;->X:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lhl1;

    .line 4
    .line 5
    iget-object v5, v0, Lhl1;->a:Lve4;

    .line 6
    .line 7
    iget-object v0, p1, Ljl1;->Z:Ljava/lang/Object;

    .line 8
    .line 9
    move-object v4, v0

    .line 10
    check-cast v4, Led1;

    .line 11
    .line 12
    sget-object v3, Loy1;->f0:Lrm;

    .line 13
    .line 14
    iget-object v0, p1, Ljl1;->Y:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v0, Lw15;

    .line 17
    .line 18
    iget v1, p2, Lsz5;->g0:I

    .line 19
    .line 20
    invoke-static {v0, v1}, Lu70;->S(Lw15;I)Lv15;

    .line 21
    .line 22
    .line 23
    move-result-object v6

    .line 24
    iget-object v0, p2, Lsz5;->i0:Lrz5;

    .line 25
    .line 26
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    const/4 v9, 0x0

    .line 34
    const/4 v10, 0x1

    .line 35
    if-eqz v0, :cond_2

    .line 36
    .line 37
    if-eq v0, v10, :cond_1

    .line 38
    .line 39
    const/4 v1, 0x2

    .line 40
    if-ne v0, v1, :cond_0

    .line 41
    .line 42
    sget-object v0, Lrt8;->Z:Lrt8;

    .line 43
    .line 44
    :goto_0
    move-object v7, v0

    .line 45
    goto :goto_1

    .line 46
    :cond_0
    invoke-static {}, Lb61;->c()V

    .line 47
    .line 48
    .line 49
    throw v9

    .line 50
    :cond_1
    sget-object v0, Lrt8;->g0:Lrt8;

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_2
    sget-object v0, Lrt8;->f0:Lrt8;

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :goto_1
    iget-boolean v8, p2, Lsz5;->h0:Z

    .line 57
    .line 58
    if-eqz v5, :cond_4

    .line 59
    .line 60
    if-eqz v4, :cond_3

    .line 61
    .line 62
    move-object v1, p0

    .line 63
    move v2, p3

    .line 64
    invoke-direct/range {v1 .. v8}, Lk3;-><init>(ILsm;Led1;Lve4;Lv15;Lrt8;Z)V

    .line 65
    .line 66
    .line 67
    iput-object p1, v1, Llm1;->o0:Ljl1;

    .line 68
    .line 69
    iput-object p2, v1, Llm1;->p0:Lsz5;

    .line 70
    .line 71
    new-instance p0, Lll1;

    .line 72
    .line 73
    new-instance p1, Lf3;

    .line 74
    .line 75
    const/16 p2, 0x14

    .line 76
    .line 77
    invoke-direct {p1, v1, p2}, Lf3;-><init>(Ljava/lang/Object;B)V

    .line 78
    .line 79
    .line 80
    invoke-direct {p0, v5, p1}, Lll1;-><init>(Lve4;Ldn2;)V

    .line 81
    .line 82
    .line 83
    iput-object p0, v1, Llm1;->q0:Lll1;

    .line 84
    .line 85
    return-void

    .line 86
    :cond_3
    invoke-static {v10}, Lv1;->B(I)V

    .line 87
    .line 88
    .line 89
    throw v9

    .line 90
    :cond_4
    const/4 p0, 0x0

    .line 91
    invoke-static {p0}, Lv1;->B(I)V

    .line 92
    .line 93
    .line 94
    throw v9
.end method


# virtual methods
.method public final I0()Ljava/util/List;
    .locals 3

    .line 1
    iget-object v0, p0, Llm1;->o0:Ljl1;

    .line 2
    .line 3
    iget-object v1, v0, Ljl1;->f0:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, Lux4;

    .line 6
    .line 7
    iget-object v2, p0, Llm1;->p0:Lsz5;

    .line 8
    .line 9
    invoke-static {v2, v1}, Lvr3;->j0(Lsz5;Lux4;)Ljava/util/List;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    if-eqz v2, :cond_0

    .line 18
    .line 19
    invoke-static {p0}, Lel1;->e(Led1;)Lzz3;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    invoke-virtual {p0}, Lzz3;->n()Laa7;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    invoke-static {p0}, Li21;->K(Ljava/lang/Object;)Ljava/util/List;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    return-object p0

    .line 32
    :cond_0
    iget-object p0, v0, Ljl1;->j0:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast p0, Lfc8;

    .line 35
    .line 36
    new-instance v0, Ljava/util/ArrayList;

    .line 37
    .line 38
    const/16 v2, 0xa

    .line 39
    .line 40
    invoke-static {v1, v2}, Lxv0;->Z(Ljava/lang/Iterable;I)I

    .line 41
    .line 42
    .line 43
    move-result v2

    .line 44
    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 45
    .line 46
    .line 47
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 52
    .line 53
    .line 54
    move-result v2

    .line 55
    if-eqz v2, :cond_1

    .line 56
    .line 57
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v2

    .line 61
    check-cast v2, Lnz5;

    .line 62
    .line 63
    invoke-virtual {p0, v2}, Lfc8;->i(Lnz5;)Lt14;

    .line 64
    .line 65
    .line 66
    move-result-object v2

    .line 67
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    goto :goto_0

    .line 71
    :cond_1
    return-object v0
.end method

.method public final getAnnotations()Lsm;
    .locals 0

    .line 1
    iget-object p0, p0, Llm1;->q0:Lll1;

    .line 2
    .line 3
    return-object p0
.end method
