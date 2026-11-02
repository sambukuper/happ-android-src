.class public abstract Lie3;
.super Ljx4;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lye8;


# instance fields
.field public q0:Lv09;

.field public r0:Lv09;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljx4;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Lw51;->p:Lwc2;

    .line 5
    .line 6
    iput-object v0, p0, Lie3;->q0:Lv09;

    .line 7
    .line 8
    iput-object v0, p0, Lie3;->r0:Lv09;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public Q0()V
    .locals 2

    .line 1
    new-instance v0, Lhe3;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-direct {v0, p0, v1}, Lhe3;-><init>(Lie3;B)V

    .line 5
    .line 6
    .line 7
    const-string v1, "androidx.compose.foundation.layout.ConsumedInsetsProvider"

    .line 8
    .line 9
    invoke-static {p0, v1, v0}, Lts7;->g(Lnh1;Ljava/lang/Object;Lgn2;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0}, Lie3;->Z0()V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public R0()V
    .locals 2

    .line 1
    iget-object v0, p0, Lie3;->q0:Lv09;

    .line 2
    .line 3
    iput-object v0, p0, Lie3;->r0:Lv09;

    .line 4
    .line 5
    new-instance v0, Lhe3;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    invoke-direct {v0, p0, v1}, Lhe3;-><init>(Lie3;B)V

    .line 9
    .line 10
    .line 11
    const-string v1, "androidx.compose.foundation.layout.ConsumedInsetsProvider"

    .line 12
    .line 13
    invoke-static {p0, v1, v0}, Lts7;->i(Ljx4;Ljava/lang/String;Lgn2;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final S0()V
    .locals 1

    .line 1
    sget-object v0, Lw51;->p:Lwc2;

    .line 2
    .line 3
    iput-object v0, p0, Lie3;->q0:Lv09;

    .line 4
    .line 5
    return-void
.end method

.method public abstract Y0(Lv09;)Lv09;
.end method

.method public Z0()V
    .locals 2

    .line 1
    iget-object v0, p0, Lie3;->q0:Lv09;

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lie3;->Y0(Lv09;)Lv09;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iput-object v0, p0, Lie3;->r0:Lv09;

    .line 8
    .line 9
    new-instance v0, Lhe3;

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    invoke-direct {v0, p0, v1}, Lhe3;-><init>(Lie3;B)V

    .line 13
    .line 14
    .line 15
    const-string v1, "androidx.compose.foundation.layout.ConsumedInsetsProvider"

    .line 16
    .line 17
    invoke-static {p0, v1, v0}, Lts7;->i(Ljx4;Ljava/lang/String;Lgn2;)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public final o()Ljava/lang/Object;
    .locals 0

    .line 1
    const-string p0, "androidx.compose.foundation.layout.ConsumedInsetsProvider"

    .line 2
    .line 3
    return-object p0
.end method
