.class public final Ldi5;
.super Ljx4;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lye8;
.implements Lw07;


# instance fields
.field public q0:Lsn;

.field public r0:Z


# virtual methods
.method public final I0()Z
    .locals 0

    .line 1
    const/4 p0, 0x1

    .line 2
    return p0
.end method

.method public final h(Lf17;)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Ldi5;->r0:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object p0, p0, Ldi5;->q0:Lsn;

    .line 6
    .line 7
    invoke-virtual {p0, p1}, Lsn;->B(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    :cond_0
    return-void
.end method

.method public final o()Ljava/lang/Object;
    .locals 0

    .line 1
    sget-object p0, Lqe4;->n0:Lqe4;

    .line 2
    .line 3
    return-object p0
.end method
