.class public final Ltl1;
.super Lgm1;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# static fields
.field public static final synthetic h:I


# instance fields
.field public final g:Lte4;


# direct methods
.method public constructor <init>(Lvl1;)V
    .locals 6

    .line 1
    iget-object v1, p1, Lvl1;->n0:Ljl1;

    .line 2
    .line 3
    iget-object p1, p1, Lvl1;->g0:Lfy5;

    .line 4
    .line 5
    iget-object v0, p1, Lfy5;->s0:Ljava/util/List;

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    new-instance v2, Ljava/util/ArrayList;

    .line 11
    .line 12
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 13
    .line 14
    .line 15
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 20
    .line 21
    .line 22
    move-result v3

    .line 23
    if-eqz v3, :cond_1

    .line 24
    .line 25
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v3

    .line 29
    move-object v4, v3

    .line 30
    check-cast v4, Lvy5;

    .line 31
    .line 32
    sget-object v5, Lmd2;->A:Ljd2;

    .line 33
    .line 34
    iget v4, v4, Lvy5;->f0:I

    .line 35
    .line 36
    invoke-virtual {v5, v4}, Ljd2;->l(I)Ljava/lang/Boolean;

    .line 37
    .line 38
    .line 39
    move-result-object v4

    .line 40
    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 41
    .line 42
    .line 43
    move-result v4

    .line 44
    if-eqz v4, :cond_0

    .line 45
    .line 46
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_1
    iget-object p1, p1, Lfy5;->t0:Ljava/util/List;

    .line 51
    .line 52
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 53
    .line 54
    .line 55
    new-instance v3, Ljava/util/ArrayList;

    .line 56
    .line 57
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 58
    .line 59
    .line 60
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    :cond_2
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 65
    .line 66
    .line 67
    move-result v0

    .line 68
    if-eqz v0, :cond_3

    .line 69
    .line 70
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    move-object v4, v0

    .line 75
    check-cast v4, Lcz5;

    .line 76
    .line 77
    sget-object v5, Lmd2;->L:Ljd2;

    .line 78
    .line 79
    iget v4, v4, Lcz5;->f0:I

    .line 80
    .line 81
    invoke-virtual {v5, v4}, Ljd2;->l(I)Ljava/lang/Boolean;

    .line 82
    .line 83
    .line 84
    move-result-object v4

    .line 85
    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 86
    .line 87
    .line 88
    move-result v4

    .line 89
    if-eqz v4, :cond_2

    .line 90
    .line 91
    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 92
    .line 93
    .line 94
    goto :goto_1

    .line 95
    :cond_3
    sget-object v4, Ld02;->X:Ld02;

    .line 96
    .line 97
    sget-object v5, Ltz;->k0:Ltz;

    .line 98
    .line 99
    move-object v0, p0

    .line 100
    invoke-direct/range {v0 .. v5}, Lgm1;-><init>(Ljl1;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ldn2;)V

    .line 101
    .line 102
    .line 103
    iget-object p0, v1, Ljl1;->X:Ljava/lang/Object;

    .line 104
    .line 105
    check-cast p0, Lhl1;

    .line 106
    .line 107
    iget-object p0, p0, Lhl1;->a:Lve4;

    .line 108
    .line 109
    new-instance p1, Lf3;

    .line 110
    .line 111
    const/16 v1, 0x10

    .line 112
    .line 113
    invoke-direct {p1, v0, v1}, Lf3;-><init>(Ljava/lang/Object;B)V

    .line 114
    .line 115
    .line 116
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 117
    .line 118
    .line 119
    new-instance v1, Lte4;

    .line 120
    .line 121
    invoke-direct {v1, p0, p1}, Lse4;-><init>(Lve4;Ldn2;)V

    .line 122
    .line 123
    .line 124
    iput-object v1, v0, Ltl1;->g:Lte4;

    .line 125
    .line 126
    return-void
.end method


# virtual methods
.method public final a(Lpk1;Lgn2;)Ljava/util/Collection;
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Ltl1;->g:Lte4;

    .line 5
    .line 6
    invoke-virtual {p0}, Lte4;->invoke()Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    check-cast p0, Ljava/util/Collection;

    .line 11
    .line 12
    return-object p0
.end method
