.class public final Lnr0;
.super Ljx4;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lw07;


# instance fields
.field public q0:Lh80;


# virtual methods
.method public final R0()V
    .locals 3

    .line 1
    sget-object v0, Lqe4;->n0:Lqe4;

    .line 2
    .line 3
    new-instance v1, Lh80;

    .line 4
    .line 5
    const/4 v2, 0x4

    .line 6
    invoke-direct {v1, v2}, Lh80;-><init>(B)V

    .line 7
    .line 8
    .line 9
    invoke-static {p0, v0, v1}, Lts7;->g(Lnh1;Ljava/lang/Object;Lgn2;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public final h(Lf17;)V
    .locals 3

    .line 1
    sget-object v0, Lqe4;->n0:Lqe4;

    .line 2
    .line 3
    new-instance v1, Lmr0;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v1, p1, v2}, Lmr0;-><init>(Lf17;B)V

    .line 7
    .line 8
    .line 9
    invoke-static {p0, v0, v1}, Lts7;->g(Lnh1;Ljava/lang/Object;Lgn2;)V

    .line 10
    .line 11
    .line 12
    iget-object p0, p0, Lnr0;->q0:Lh80;

    .line 13
    .line 14
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    return-void
.end method
