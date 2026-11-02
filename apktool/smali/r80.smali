.class public final Lr80;
.super Ljx4;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public q0:Lq80;


# direct methods
.method public constructor <init>(Lq80;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljx4;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lr80;->q0:Lq80;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final N0()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public final Q0()V
    .locals 2

    .line 1
    iget-object v0, p0, Lr80;->q0:Lq80;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v1, v0, Lq80;->a:Lc15;

    .line 6
    .line 7
    invoke-virtual {v1, p0}, Lc15;->j(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    :cond_0
    if-eqz v0, :cond_1

    .line 11
    .line 12
    iget-object v1, v0, Lq80;->a:Lc15;

    .line 13
    .line 14
    invoke-virtual {v1, p0}, Lc15;->b(Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    :cond_1
    iput-object v0, p0, Lr80;->q0:Lq80;

    .line 18
    .line 19
    return-void
.end method

.method public final R0()V
    .locals 1

    .line 1
    iget-object v0, p0, Lr80;->q0:Lq80;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, v0, Lq80;->a:Lc15;

    .line 6
    .line 7
    invoke-virtual {v0, p0}, Lc15;->j(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    :cond_0
    return-void
.end method
