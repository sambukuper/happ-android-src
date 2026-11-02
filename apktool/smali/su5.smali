.class public final Lsu5;
.super Ljava/util/concurrent/atomic/AtomicReference;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public final X:Ljava/lang/Object;

.field public Y:Lsu5;

.field public Z:Lsu5;


# direct methods
.method public constructor <init>(Ljava/lang/Object;Luu5;)V
    .locals 0

    .line 1
    invoke-direct {p0, p2}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lsu5;->X:Ljava/lang/Object;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Luu5;

    .line 6
    .line 7
    iget-object p0, p0, Luu5;->b:Ljava/lang/Object;

    .line 8
    .line 9
    return-object p0
.end method
