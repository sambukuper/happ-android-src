.class public final Lsm6;
.super Luy7;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lrn2;


# instance fields
.field public final synthetic g0:B

.field public final synthetic h0:Z

.field public final synthetic i0:Loh2;

.field public final synthetic j0:Lgn2;


# direct methods
.method public synthetic constructor <init>(ZLoh2;Lgn2;Lq51;B)V
    .locals 0

    .line 1
    iput-byte p5, p0, Lsm6;->g0:B

    .line 2
    .line 3
    iput-boolean p1, p0, Lsm6;->h0:Z

    .line 4
    .line 5
    iput-object p2, p0, Lsm6;->i0:Loh2;

    .line 6
    .line 7
    iput-object p3, p0, Lsm6;->j0:Lgn2;

    .line 8
    .line 9
    const/4 p1, 0x2

    .line 10
    invoke-direct {p0, p1, p4}, Luy7;-><init>(ILq51;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final K(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-byte v0, p0, Lsm6;->g0:B

    .line 2
    .line 3
    sget-object v1, Ldn8;->a:Ldn8;

    .line 4
    .line 5
    check-cast p1, Lb71;

    .line 6
    .line 7
    check-cast p2, Lq51;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, p2, p1}, Lsm6;->n(Lq51;Ljava/lang/Object;)Lq51;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    check-cast p0, Lsm6;

    .line 17
    .line 18
    invoke-virtual {p0, v1}, Lsm6;->q(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    return-object v1

    .line 22
    :pswitch_0
    invoke-virtual {p0, p2, p1}, Lsm6;->n(Lq51;Ljava/lang/Object;)Lq51;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    check-cast p0, Lsm6;

    .line 27
    .line 28
    invoke-virtual {p0, v1}, Lsm6;->q(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 7

    .line 1
    iget-byte p2, p0, Lsm6;->g0:B

    .line 2
    .line 3
    packed-switch p2, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v0, Lsm6;

    .line 7
    .line 8
    iget-object v3, p0, Lsm6;->j0:Lgn2;

    .line 9
    .line 10
    const/4 v5, 0x1

    .line 11
    iget-boolean v1, p0, Lsm6;->h0:Z

    .line 12
    .line 13
    iget-object v2, p0, Lsm6;->i0:Loh2;

    .line 14
    .line 15
    move-object v4, p1

    .line 16
    invoke-direct/range {v0 .. v5}, Lsm6;-><init>(ZLoh2;Lgn2;Lq51;B)V

    .line 17
    .line 18
    .line 19
    return-object v0

    .line 20
    :pswitch_0
    move-object v4, p1

    .line 21
    new-instance v1, Lsm6;

    .line 22
    .line 23
    move-object v5, v4

    .line 24
    iget-object v4, p0, Lsm6;->j0:Lgn2;

    .line 25
    .line 26
    const/4 v6, 0x0

    .line 27
    iget-boolean v2, p0, Lsm6;->h0:Z

    .line 28
    .line 29
    iget-object v3, p0, Lsm6;->i0:Loh2;

    .line 30
    .line 31
    invoke-direct/range {v1 .. v6}, Lsm6;-><init>(ZLoh2;Lgn2;Lq51;B)V

    .line 32
    .line 33
    .line 34
    return-object v1

    .line 35
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final q(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget-byte v0, p0, Lsm6;->g0:B

    .line 2
    .line 3
    sget-object v1, Ldn8;->a:Ldn8;

    .line 4
    .line 5
    iget-object v2, p0, Lsm6;->j0:Lgn2;

    .line 6
    .line 7
    iget-object v3, p0, Lsm6;->i0:Loh2;

    .line 8
    .line 9
    iget-boolean p0, p0, Lsm6;->h0:Z

    .line 10
    .line 11
    packed-switch v0, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    if-eqz p0, :cond_0

    .line 18
    .line 19
    invoke-static {v3}, Loh2;->a(Loh2;)Z

    .line 20
    .line 21
    .line 22
    sget-object p0, Ldo6;->a:Ldo6;

    .line 23
    .line 24
    invoke-interface {v2, p0}, Lgn2;->B(Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    :cond_0
    return-object v1

    .line 28
    :pswitch_0
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    if-eqz p0, :cond_1

    .line 32
    .line 33
    invoke-static {v3}, Loh2;->a(Loh2;)Z

    .line 34
    .line 35
    .line 36
    sget-object p0, Lfo7;->a:Lfo7;

    .line 37
    .line 38
    invoke-interface {v2, p0}, Lgn2;->B(Ljava/lang/Object;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    :cond_1
    return-object v1

    .line 42
    nop

    .line 43
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
