.class public final Ljr0;
.super Lgm3;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lir0;


# instance fields
.field public final g0:Lrm3;


# direct methods
.method public constructor <init>(Lrm3;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lwe4;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ljr0;->g0:Lrm3;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Throwable;)Z
    .locals 0

    .line 1
    invoke-virtual {p0}, Lgm3;->j()Lrm3;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0, p1}, Lrm3;->x(Ljava/lang/Throwable;)Z

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0
.end method

.method public final getParent()Lbm3;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lgm3;->j()Lrm3;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public final m()Z
    .locals 0

    .line 1
    const/4 p0, 0x1

    .line 2
    return p0
.end method

.method public final n(Ljava/lang/Throwable;)V
    .locals 0

    .line 1
    iget-object p1, p0, Ljr0;->g0:Lrm3;

    .line 2
    .line 3
    invoke-virtual {p0}, Lgm3;->j()Lrm3;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-virtual {p1, p0}, Lrm3;->i(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    return-void
.end method
