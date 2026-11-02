.class public final Lox5;
.super Lg33;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public final f:Ljava/lang/Class;

.field public final g:Ljava/lang/Class;

.field public final h:Lar3;

.field public final i:Lar3;


# direct methods
.method public constructor <init>(Lrx5;Ljava/lang/Class;Lar3;Ljava/lang/Class;Lar3;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, Lox5;->f:Ljava/lang/Class;

    .line 5
    .line 6
    iput-object p3, p0, Lox5;->h:Lar3;

    .line 7
    .line 8
    iput-object p4, p0, Lox5;->g:Ljava/lang/Class;

    .line 9
    .line 10
    iput-object p5, p0, Lox5;->i:Lar3;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final J(Ljava/lang/Class;Lar3;)Lg33;
    .locals 4

    .line 1
    new-instance v0, Lsx5;

    .line 2
    .line 3
    iget-object v1, p0, Lox5;->f:Ljava/lang/Class;

    .line 4
    .line 5
    iget-object v2, p0, Lox5;->h:Lar3;

    .line 6
    .line 7
    invoke-direct {v0, v1, v2}, Lsx5;-><init>(Ljava/lang/Class;Lar3;)V

    .line 8
    .line 9
    .line 10
    new-instance v1, Lsx5;

    .line 11
    .line 12
    iget-object v2, p0, Lox5;->g:Ljava/lang/Class;

    .line 13
    .line 14
    iget-object v3, p0, Lox5;->i:Lar3;

    .line 15
    .line 16
    invoke-direct {v1, v2, v3}, Lsx5;-><init>(Ljava/lang/Class;Lar3;)V

    .line 17
    .line 18
    .line 19
    new-instance v2, Lsx5;

    .line 20
    .line 21
    invoke-direct {v2, p1, p2}, Lsx5;-><init>(Ljava/lang/Class;Lar3;)V

    .line 22
    .line 23
    .line 24
    filled-new-array {v0, v1, v2}, [Lsx5;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    new-instance p2, Lqx5;

    .line 29
    .line 30
    invoke-direct {p2, p0, p1}, Lqx5;-><init>(Lg33;[Lsx5;)V

    .line 31
    .line 32
    .line 33
    return-object p2
.end method

.method public final R(Ljava/lang/Class;)Lar3;
    .locals 1

    .line 1
    iget-object v0, p0, Lox5;->f:Ljava/lang/Class;

    .line 2
    .line 3
    if-ne p1, v0, :cond_0

    .line 4
    .line 5
    iget-object p0, p0, Lox5;->h:Lar3;

    .line 6
    .line 7
    return-object p0

    .line 8
    :cond_0
    iget-object v0, p0, Lox5;->g:Ljava/lang/Class;

    .line 9
    .line 10
    if-ne p1, v0, :cond_1

    .line 11
    .line 12
    iget-object p0, p0, Lox5;->i:Lar3;

    .line 13
    .line 14
    return-object p0

    .line 15
    :cond_1
    const/4 p0, 0x0

    .line 16
    return-object p0
.end method
