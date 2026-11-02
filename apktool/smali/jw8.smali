.class public final Ljw8;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Landroid/view/Choreographer$FrameCallback;


# instance fields
.field public final synthetic X:Lkw8;


# direct methods
.method public constructor <init>(Lkw8;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ljw8;->X:Lkw8;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final doFrame(J)V
    .locals 0

    .line 1
    iget-object p0, p0, Ljw8;->X:Lkw8;

    .line 2
    .line 3
    iget-object p0, p0, Lkw8;->X:Lxb;

    .line 4
    .line 5
    invoke-virtual {p0}, Lxb;->run()V

    .line 6
    .line 7
    .line 8
    return-void
.end method
