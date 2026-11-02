.class public final Lrx5;
.super Lg33;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public final f:Ljava/lang/Class;

.field public final g:Lar3;


# direct methods
.method public constructor <init>(Lg33;Ljava/lang/Class;Lar3;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, Lrx5;->f:Ljava/lang/Class;

    .line 5
    .line 6
    iput-object p3, p0, Lrx5;->g:Lar3;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final J(Ljava/lang/Class;Lar3;)Lg33;
    .locals 6

    .line 1
    new-instance v0, Lox5;

    .line 2
    .line 3
    iget-object v2, p0, Lrx5;->f:Ljava/lang/Class;

    .line 4
    .line 5
    iget-object v3, p0, Lrx5;->g:Lar3;

    .line 6
    .line 7
    move-object v1, p0

    .line 8
    move-object v4, p1

    .line 9
    move-object v5, p2

    .line 10
    invoke-direct/range {v0 .. v5}, Lox5;-><init>(Lrx5;Ljava/lang/Class;Lar3;Ljava/lang/Class;Lar3;)V

    .line 11
    .line 12
    .line 13
    return-object v0
.end method

.method public final R(Ljava/lang/Class;)Lar3;
    .locals 1

    .line 1
    iget-object v0, p0, Lrx5;->f:Ljava/lang/Class;

    .line 2
    .line 3
    if-ne p1, v0, :cond_0

    .line 4
    .line 5
    iget-object p0, p0, Lrx5;->g:Lar3;

    .line 6
    .line 7
    return-object p0

    .line 8
    :cond_0
    const/4 p0, 0x0

    .line 9
    return-object p0
.end method
