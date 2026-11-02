.class public final Lny8;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lcj0;


# instance fields
.field public final X:Lcj0;

.field public final Y:Lpy8;

.field public final Z:Lqy8;

.field public final f0:Loy8;


# direct methods
.method public constructor <init>(Lcj0;Loy8;Lkp5;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lny8;->X:Lcj0;

    .line 5
    .line 6
    iput-object p2, p0, Lny8;->f0:Loy8;

    .line 7
    .line 8
    new-instance p2, Lpy8;

    .line 9
    .line 10
    invoke-interface {p1}, Lcj0;->g()Lqh0;

    .line 11
    .line 12
    .line 13
    move-result-object p3

    .line 14
    invoke-direct {p2, p3}, Ltj2;-><init>(Lqh0;)V

    .line 15
    .line 16
    .line 17
    iput-object p2, p0, Lny8;->Y:Lpy8;

    .line 18
    .line 19
    new-instance p2, Lqy8;

    .line 20
    .line 21
    invoke-interface {p1}, Lcj0;->s()Laj0;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    invoke-direct {p2, p1}, Lqy8;-><init>(Laj0;)V

    .line 26
    .line 27
    .line 28
    iput-object p2, p0, Lny8;->Z:Lqy8;

    .line 29
    .line 30
    return-void
.end method


# virtual methods
.method public final a()Lxb4;
    .locals 1

    .line 1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 2
    .line 3
    const-string v0, "Operation not supported by VirtualCamera."

    .line 4
    .line 5
    invoke-direct {p0, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw p0
.end method

.method public final b()Lr85;
    .locals 0

    .line 1
    iget-object p0, p0, Lny8;->X:Lcj0;

    .line 2
    .line 3
    invoke-interface {p0}, Lcj0;->b()Lr85;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final d(Lhq8;)V
    .locals 0

    .line 1
    invoke-static {}, Ls08;->b()V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lny8;->f0:Loy8;

    .line 5
    .line 6
    invoke-virtual {p0, p1}, Loy8;->d(Lhq8;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final f(Lhq8;)V
    .locals 0

    .line 1
    invoke-static {}, Ls08;->b()V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lny8;->f0:Loy8;

    .line 5
    .line 6
    invoke-virtual {p0, p1}, Loy8;->f(Lhq8;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final g()Lqh0;
    .locals 0

    .line 1
    iget-object p0, p0, Lny8;->Y:Lpy8;

    .line 2
    .line 3
    return-object p0
.end method

.method public final i(Lhq8;)V
    .locals 0

    .line 1
    invoke-static {}, Ls08;->b()V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lny8;->f0:Loy8;

    .line 5
    .line 6
    invoke-virtual {p0, p1}, Loy8;->i(Lhq8;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final k(Lhq8;)V
    .locals 0

    .line 1
    invoke-static {}, Ls08;->b()V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lny8;->f0:Loy8;

    .line 5
    .line 6
    invoke-virtual {p0, p1}, Loy8;->k(Lhq8;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final n(Ljava/util/ArrayList;)V
    .locals 0

    .line 1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 2
    .line 3
    const-string p1, "Operation not supported by VirtualCamera."

    .line 4
    .line 5
    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw p0
.end method

.method public final o(Ljava/util/ArrayList;)V
    .locals 0

    .line 1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 2
    .line 3
    const-string p1, "Operation not supported by VirtualCamera."

    .line 4
    .line 5
    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw p0
.end method

.method public final q()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public final s()Laj0;
    .locals 0

    .line 1
    iget-object p0, p0, Lny8;->Z:Lqy8;

    .line 2
    .line 3
    return-object p0
.end method
