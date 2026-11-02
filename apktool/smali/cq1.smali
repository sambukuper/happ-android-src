.class public final Lcq1;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lvc6;


# instance fields
.field public final X:Lgn2;

.field public Y:Ldq1;


# direct methods
.method public constructor <init>(Lgn2;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcq1;->X:Lgn2;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 0

    .line 1
    return-void
.end method

.method public final b()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcq1;->Y:Ldq1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0}, Ldq1;->a()V

    .line 6
    .line 7
    .line 8
    :cond_0
    const/4 v0, 0x0

    .line 9
    iput-object v0, p0, Lcq1;->Y:Ldq1;

    .line 10
    .line 11
    return-void
.end method

.method public final c()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcq1;->X:Lgn2;

    .line 2
    .line 3
    sget-object v1, Lu70;->c:Leq1;

    .line 4
    .line 5
    invoke-interface {v0, v1}, Lgn2;->B(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Ldq1;

    .line 10
    .line 11
    iput-object v0, p0, Lcq1;->Y:Ldq1;

    .line 12
    .line 13
    return-void
.end method
