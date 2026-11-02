.class public final Lp15;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Llm0;
.implements Lvz8;


# instance fields
.field public final X:Lmm0;

.field public final synthetic Y:Lq15;


# direct methods
.method public constructor <init>(Lq15;Lmm0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lp15;->Y:Lq15;

    .line 5
    .line 6
    iput-object p2, p0, Lp15;->X:Lmm0;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final E(Ljava/lang/Object;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lp15;->X:Lmm0;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lmm0;->E(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final a(Lnz6;I)V
    .locals 0

    .line 1
    iget-object p0, p0, Lp15;->X:Lmm0;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Lmm0;->a(Lnz6;I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final f(Ljava/lang/Object;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lp15;->X:Lmm0;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lmm0;->f(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final j(Ljava/lang/Object;Lsn2;)Lz31;
    .locals 1

    .line 1
    check-cast p1, Ldn8;

    .line 2
    .line 3
    new-instance p2, Lm30;

    .line 4
    .line 5
    iget-object v0, p0, Lp15;->Y:Lq15;

    .line 6
    .line 7
    invoke-direct {p2, v0, p0}, Lm30;-><init>(Lq15;Lp15;)V

    .line 8
    .line 9
    .line 10
    iget-object p0, p0, Lp15;->X:Lmm0;

    .line 11
    .line 12
    invoke-virtual {p0, p1, p2}, Lmm0;->H(Ljava/lang/Object;Lsn2;)Lz31;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    if-eqz p0, :cond_0

    .line 17
    .line 18
    sget-object p1, Lq15;->k0:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 19
    .line 20
    const/4 p2, 0x0

    .line 21
    invoke-virtual {p1, v0, p2}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    :cond_0
    return-object p0
.end method

.method public final w()Ls61;
    .locals 0

    .line 1
    iget-object p0, p0, Lp15;->X:Lmm0;

    .line 2
    .line 3
    iget-object p0, p0, Lmm0;->g0:Ls61;

    .line 4
    .line 5
    return-object p0
.end method

.method public final y(Ljava/lang/Object;Lsn2;)V
    .locals 3

    .line 1
    check-cast p1, Ldn8;

    .line 2
    .line 3
    sget-object p2, Lq15;->k0:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    iget-object v1, p0, Lp15;->Y:Lq15;

    .line 7
    .line 8
    invoke-virtual {p2, v1, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    new-instance p2, Lvj2;

    .line 12
    .line 13
    invoke-direct {p2, v1, p0}, Lvj2;-><init>(Lq15;Lp15;)V

    .line 14
    .line 15
    .line 16
    iget-object p0, p0, Lp15;->X:Lmm0;

    .line 17
    .line 18
    iget v0, p0, Lqp1;->Z:I

    .line 19
    .line 20
    new-instance v1, Lm30;

    .line 21
    .line 22
    const/4 v2, 0x2

    .line 23
    invoke-direct {v1, p2, v2}, Lm30;-><init>(Ljava/lang/Object;B)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0, p1, v0, v1}, Lmm0;->D(Ljava/lang/Object;ILsn2;)V

    .line 27
    .line 28
    .line 29
    return-void
.end method

.method public final z(Ljava/lang/Throwable;)Z
    .locals 0

    .line 1
    iget-object p0, p0, Lp15;->X:Lmm0;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lmm0;->z(Ljava/lang/Throwable;)Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method
