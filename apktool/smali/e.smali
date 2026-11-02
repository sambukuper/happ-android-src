.class public final Le;
.super Lqj6;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lrn2;


# instance fields
.field public Z:Lkt;

.field public f0:Ljava/util/Iterator;

.field public g0:Z

.field public synthetic h0:Ljava/lang/Object;

.field public final synthetic i0:Loi5;

.field public final synthetic j0:Ls92;

.field public final synthetic k0:Z


# direct methods
.method public constructor <init>(Loi5;Ls92;ZLq51;)V
    .locals 0

    .line 1
    iput-object p1, p0, Le;->i0:Loi5;

    .line 2
    .line 3
    iput-object p2, p0, Le;->j0:Ls92;

    .line 4
    .line 5
    iput-boolean p3, p0, Le;->k0:Z

    .line 6
    .line 7
    const/4 p1, 0x2

    .line 8
    invoke-direct {p0, p1, p4}, Lqj6;-><init>(ILq51;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final K(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lv27;

    .line 2
    .line 3
    check-cast p2, Lq51;

    .line 4
    .line 5
    invoke-virtual {p0, p2, p1}, Le;->n(Lq51;Ljava/lang/Object;)Lq51;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, Le;

    .line 10
    .line 11
    sget-object p1, Ldn8;->a:Ldn8;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, Le;->q(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public final n(Lq51;Ljava/lang/Object;)Lq51;
    .locals 3

    .line 1
    new-instance v0, Le;

    .line 2
    .line 3
    iget-object v1, p0, Le;->j0:Ls92;

    .line 4
    .line 5
    iget-boolean v2, p0, Le;->k0:Z

    .line 6
    .line 7
    iget-object p0, p0, Le;->i0:Loi5;

    .line 8
    .line 9
    invoke-direct {v0, p0, v1, v2, p1}, Le;-><init>(Loi5;Ls92;ZLq51;)V

    .line 10
    .line 11
    .line 12
    iput-object p2, v0, Le;->h0:Ljava/lang/Object;

    .line 13
    .line 14
    return-object v0
.end method

.method public final q(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    iget-boolean v0, p0, Le;->g0:Z

    .line 2
    .line 3
    iget-object v2, p0, Le;->j0:Ls92;

    .line 4
    .line 5
    const/4 v8, 0x1

    .line 6
    if-eqz v0, :cond_1

    .line 7
    .line 8
    if-ne v0, v8, :cond_0

    .line 9
    .line 10
    iget-object v0, p0, Le;->f0:Ljava/util/Iterator;

    .line 11
    .line 12
    iget-object v1, p0, Le;->Z:Lkt;

    .line 13
    .line 14
    iget-object v3, p0, Le;->h0:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v3, Lv27;

    .line 17
    .line 18
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    move-object v7, v3

    .line 22
    move-object v3, v1

    .line 23
    move-object v1, v7

    .line 24
    move-object v7, p0

    .line 25
    goto :goto_1

    .line 26
    :cond_0
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 27
    .line 28
    invoke-static {p0}, Lbt;->i(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    const/4 p0, 0x0

    .line 32
    return-object p0

    .line 33
    :cond_1
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    iget-object p1, p0, Le;->h0:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast p1, Lv27;

    .line 39
    .line 40
    new-instance v0, Lkt;

    .line 41
    .line 42
    invoke-direct {v0}, Lkt;-><init>()V

    .line 43
    .line 44
    .line 45
    iget-object v1, p0, Le;->i0:Loi5;

    .line 46
    .line 47
    invoke-virtual {v0, v1}, Lkt;->addLast(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {v2, v1}, Ls92;->list(Loi5;)Ljava/util/List;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    move-object v3, v0

    .line 59
    move-object v0, v1

    .line 60
    move-object v1, p1

    .line 61
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 62
    .line 63
    .line 64
    move-result p1

    .line 65
    if-eqz p1, :cond_3

    .line 66
    .line 67
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    move-object v4, p1

    .line 72
    check-cast v4, Loi5;

    .line 73
    .line 74
    iput-object v1, p0, Le;->h0:Ljava/lang/Object;

    .line 75
    .line 76
    iput-object v3, p0, Le;->Z:Lkt;

    .line 77
    .line 78
    iput-object v0, p0, Le;->f0:Ljava/util/Iterator;

    .line 79
    .line 80
    iput-boolean v8, p0, Le;->g0:Z

    .line 81
    .line 82
    iget-boolean v5, p0, Le;->k0:Z

    .line 83
    .line 84
    const/4 v6, 0x0

    .line 85
    move-object v7, p0

    .line 86
    invoke-static/range {v1 .. v7}, Ljm4;->u(Lv27;Ls92;Lkt;Loi5;ZZLr10;)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object p0

    .line 90
    sget-object p1, Lc71;->X:Lc71;

    .line 91
    .line 92
    if-ne p0, p1, :cond_2

    .line 93
    .line 94
    return-object p1

    .line 95
    :cond_2
    :goto_1
    move-object p0, v7

    .line 96
    goto :goto_0

    .line 97
    :cond_3
    sget-object p0, Ldn8;->a:Ldn8;

    .line 98
    .line 99
    return-object p0
.end method
