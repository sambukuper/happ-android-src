.class public final Lt61;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lr61;


# instance fields
.field public final X:Lgn2;

.field public final Y:Lr61;


# direct methods
.method public constructor <init>(Lr61;Lgn2;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p2, p0, Lt61;->X:Lgn2;

    .line 8
    .line 9
    instance-of p2, p1, Lt61;

    .line 10
    .line 11
    if-eqz p2, :cond_0

    .line 12
    .line 13
    check-cast p1, Lt61;

    .line 14
    .line 15
    iget-object p1, p1, Lt61;->Y:Lr61;

    .line 16
    .line 17
    :cond_0
    iput-object p1, p0, Lt61;->Y:Lr61;

    .line 18
    .line 19
    return-void
.end method
