.class public final synthetic Lgv2;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lgq1;


# instance fields
.field public final synthetic X:Lhv2;

.field public final synthetic Y:Ljava/lang/Runnable;


# direct methods
.method public synthetic constructor <init>(Lhv2;Ljava/lang/Runnable;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lgv2;->X:Lhv2;

    .line 5
    .line 6
    iput-object p2, p0, Lgv2;->Y:Ljava/lang/Runnable;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 1

    .line 1
    iget-object v0, p0, Lgv2;->Y:Ljava/lang/Runnable;

    .line 2
    .line 3
    iget-object p0, p0, Lgv2;->X:Lhv2;

    .line 4
    .line 5
    iget-object p0, p0, Lhv2;->Z:Landroid/os/Handler;

    .line 6
    .line 7
    invoke-virtual {p0, v0}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method
