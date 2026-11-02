.class public final Lr39;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Llj2;


# instance fields
.field public final X:Ly5;

.field public final Y:Lfv5;

.field public final Z:Ln49;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-string v0, "WMFgUpdater"

    .line 2
    .line 3
    invoke-static {v0}, Llh4;->a1(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public constructor <init>(Landroidx/work/impl/WorkDatabase;Lfv5;Ly5;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, Lr39;->Y:Lfv5;

    .line 5
    .line 6
    iput-object p3, p0, Lr39;->X:Ly5;

    .line 7
    .line 8
    invoke-virtual {p1}, Landroidx/work/impl/WorkDatabase;->x()Ln49;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    iput-object p1, p0, Lr39;->Z:Ln49;

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final c(Landroid/content/Context;Ljava/util/UUID;Lkj2;)Lxb4;
    .locals 7

    .line 1
    iget-object v0, p0, Lr39;->X:Ly5;

    .line 2
    .line 3
    iget-object v0, v0, Ly5;->Y:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, Lh37;

    .line 6
    .line 7
    new-instance v1, Lhd;

    .line 8
    .line 9
    const/4 v6, 0x6

    .line 10
    move-object v2, p0

    .line 11
    move-object v5, p1

    .line 12
    move-object v3, p2

    .line 13
    move-object v4, p3

    .line 14
    invoke-direct/range {v1 .. v6}, Lhd;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 15
    .line 16
    .line 17
    const-string p0, "setForegroundAsync"

    .line 18
    .line 19
    invoke-static {v0, p0, v1}, Lvr3;->u(Ljava/util/concurrent/Executor;Ljava/lang/String;Ldn2;)Lud0;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    return-object p0
.end method
