.class public final synthetic Lzw6;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lp52;


# instance fields
.field public final synthetic X:Ljava/util/concurrent/Executor;

.field public final synthetic Y:Landroidx/work/impl/WorkDatabase;

.field public final synthetic Z:Ljava/util/List;

.field public final synthetic f0:Lxy0;


# direct methods
.method public synthetic constructor <init>(Ljava/util/concurrent/Executor;Landroidx/work/impl/WorkDatabase;Ljava/util/List;Lxy0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lzw6;->X:Ljava/util/concurrent/Executor;

    .line 5
    .line 6
    iput-object p2, p0, Lzw6;->Y:Landroidx/work/impl/WorkDatabase;

    .line 7
    .line 8
    iput-object p3, p0, Lzw6;->Z:Ljava/util/List;

    .line 9
    .line 10
    iput-object p4, p0, Lzw6;->f0:Lxy0;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final b(Ls39;Z)V
    .locals 6

    .line 1
    new-instance v0, Lrg0;

    .line 2
    .line 3
    const/4 v5, 0x2

    .line 4
    iget-object v1, p0, Lzw6;->Y:Landroidx/work/impl/WorkDatabase;

    .line 5
    .line 6
    iget-object v3, p0, Lzw6;->Z:Ljava/util/List;

    .line 7
    .line 8
    iget-object v4, p0, Lzw6;->f0:Lxy0;

    .line 9
    .line 10
    move-object v2, p1

    .line 11
    invoke-direct/range {v0 .. v5}, Lrg0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 12
    .line 13
    .line 14
    iget-object p0, p0, Lzw6;->X:Ljava/util/concurrent/Executor;

    .line 15
    .line 16
    invoke-interface {p0, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method
