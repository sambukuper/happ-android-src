.class public final synthetic Lsh;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Ljava/util/concurrent/ThreadFactory;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lth;


# direct methods
.method public synthetic constructor <init>(ILth;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lsh;->a:I

    .line 5
    .line 6
    iput-object p2, p0, Lsh;->b:Lth;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final newThread(Ljava/lang/Runnable;)Ljava/lang/Thread;
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    :goto_0
    iget v1, p0, Lsh;->a:I

    .line 3
    .line 4
    const/16 v2, 0xa

    .line 5
    .line 6
    if-ge v0, v2, :cond_1

    .line 7
    .line 8
    sget-object v2, Luh;->a:[I

    .line 9
    .line 10
    aget v2, v2, v0

    .line 11
    .line 12
    if-lt v1, v2, :cond_0

    .line 13
    .line 14
    add-int/lit8 v2, v0, 0x1

    .line 15
    .line 16
    goto :goto_1

    .line 17
    :cond_0
    add-int/lit8 v0, v0, 0x1

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_1
    :goto_1
    new-instance v0, Lrh;

    .line 21
    .line 22
    invoke-direct {v0, v1, p1}, Lrh;-><init>(ILjava/lang/Runnable;)V

    .line 23
    .line 24
    .line 25
    iget-object p0, p0, Lsh;->b:Lth;

    .line 26
    .line 27
    invoke-virtual {p0, v0}, Lth;->newThread(Ljava/lang/Runnable;)Ljava/lang/Thread;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    invoke-virtual {p0, v2}, Ljava/lang/Thread;->setPriority(I)V

    .line 32
    .line 33
    .line 34
    return-object p0
.end method
