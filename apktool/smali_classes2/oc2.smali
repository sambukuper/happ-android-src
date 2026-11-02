.class public final Loc2;
.super Luy7;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lrn2;


# instance fields
.field public final synthetic g0:B

.field public synthetic h0:Ljava/lang/Object;

.field public final synthetic i0:Lqc2;

.field public final synthetic j0:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Lqc2;Ljava/lang/String;Lq51;B)V
    .locals 0

    .line 1
    iput-byte p4, p0, Loc2;->g0:B

    .line 2
    .line 3
    iput-object p1, p0, Loc2;->i0:Lqc2;

    .line 4
    .line 5
    iput-object p2, p0, Loc2;->j0:Ljava/lang/String;

    .line 6
    .line 7
    const/4 p1, 0x2

    .line 8
    invoke-direct {p0, p1, p3}, Luy7;-><init>(ILq51;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final K(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-byte v0, p0, Loc2;->g0:B

    .line 2
    .line 3
    sget-object v1, Ldn8;->a:Ldn8;

    .line 4
    .line 5
    check-cast p1, Lo05;

    .line 6
    .line 7
    check-cast p2, Lq51;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, p2, p1}, Loc2;->n(Lq51;Ljava/lang/Object;)Lq51;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    check-cast p0, Loc2;

    .line 17
    .line 18
    invoke-virtual {p0, v1}, Loc2;->q(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    return-object v1

    .line 22
    :pswitch_0
    invoke-virtual {p0, p2, p1}, Loc2;->n(Lq51;Ljava/lang/Object;)Lq51;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    check-cast p0, Loc2;

    .line 27
    .line 28
    invoke-virtual {p0, v1}, Loc2;->q(Ljava/lang/Object;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    return-object v1

    .line 32
    nop

    .line 33
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final n(Lq51;Ljava/lang/Object;)Lq51;
    .locals 3

    .line 1
    iget-byte v0, p0, Loc2;->g0:B

    .line 2
    .line 3
    iget-object v1, p0, Loc2;->j0:Ljava/lang/String;

    .line 4
    .line 5
    iget-object p0, p0, Loc2;->i0:Lqc2;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    new-instance v0, Loc2;

    .line 11
    .line 12
    const/4 v2, 0x1

    .line 13
    invoke-direct {v0, p0, v1, p1, v2}, Loc2;-><init>(Lqc2;Ljava/lang/String;Lq51;B)V

    .line 14
    .line 15
    .line 16
    iput-object p2, v0, Loc2;->h0:Ljava/lang/Object;

    .line 17
    .line 18
    return-object v0

    .line 19
    :pswitch_0
    new-instance v0, Loc2;

    .line 20
    .line 21
    const/4 v2, 0x0

    .line 22
    invoke-direct {v0, p0, v1, p1, v2}, Loc2;-><init>(Lqc2;Ljava/lang/String;Lq51;B)V

    .line 23
    .line 24
    .line 25
    iput-object p2, v0, Loc2;->h0:Ljava/lang/Object;

    .line 26
    .line 27
    return-object v0

    .line 28
    nop

    .line 29
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final q(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1
    iget-byte v0, p0, Loc2;->g0:B

    .line 2
    .line 3
    sget-object v1, Ldn8;->a:Ldn8;

    .line 4
    .line 5
    iget-object v2, p0, Loc2;->j0:Ljava/lang/String;

    .line 6
    .line 7
    iget-object v3, p0, Loc2;->i0:Lqc2;

    .line 8
    .line 9
    iget-object p0, p0, Loc2;->h0:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast p0, Lo05;

    .line 12
    .line 13
    packed-switch v0, :pswitch_data_0

    .line 14
    .line 15
    .line 16
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    iget-object p1, v3, Lqc2;->b:Ljs5;

    .line 20
    .line 21
    invoke-virtual {p0, p1}, Lo05;->c(Ljs5;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    check-cast v0, Ljava/util/Set;

    .line 26
    .line 27
    if-nez v0, :cond_0

    .line 28
    .line 29
    sget-object v0, Lm02;->X:Lm02;

    .line 30
    .line 31
    :cond_0
    check-cast v0, Ljava/lang/Iterable;

    .line 32
    .line 33
    new-instance v3, Lhu;

    .line 34
    .line 35
    const/4 v4, 0x1

    .line 36
    invoke-direct {v3, v0, v4}, Lhu;-><init>(Ljava/lang/Object;B)V

    .line 37
    .line 38
    .line 39
    new-instance v0, Lya2;

    .line 40
    .line 41
    const/4 v4, 0x7

    .line 42
    invoke-direct {v0, v4}, Lya2;-><init>(B)V

    .line 43
    .line 44
    .line 45
    invoke-static {v3, v0}, Lw27;->m0(Lu27;Lgn2;)Lla2;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    new-instance v3, Lm40;

    .line 50
    .line 51
    const/16 v4, 0x8

    .line 52
    .line 53
    invoke-direct {v3, v2, v4}, Lm40;-><init>(Ljava/lang/String;B)V

    .line 54
    .line 55
    .line 56
    invoke-static {v0, v3}, Lw27;->l0(Lu27;Lgn2;)Lmd8;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    invoke-static {v0}, Lw27;->o0(Lu27;)Ljava/util/Set;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    invoke-virtual {p0, p1, v0}, Lo05;->f(Ljs5;Ljava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    return-object v1

    .line 68
    :pswitch_0
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 69
    .line 70
    .line 71
    iget-object p1, v3, Lqc2;->c:Ljs5;

    .line 72
    .line 73
    invoke-virtual {p0, p1, v2}, Lo05;->e(Ljs5;Ljava/lang/Object;)V

    .line 74
    .line 75
    .line 76
    return-object v1

    .line 77
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
