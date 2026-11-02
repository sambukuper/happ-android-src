.class public final Lnv8;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lkq8;


# instance fields
.field public final a:Lqv;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    invoke-static {v0}, Lnr4;->f(I)Lqv;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iput-object v0, p0, Lnv8;->a:Lqv;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final b(Lqq8;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final reset()V
    .locals 1

    .line 1
    iget-object p0, p0, Lnv8;->a:Lqv;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    iput v0, p0, Lqv;->a:I

    .line 5
    .line 6
    const-string p0, "CXCP"

    .line 7
    .line 8
    invoke-static {p0}, Lhi5;->i0(Ljava/lang/String;)Z

    .line 9
    .line 10
    .line 11
    return-void
.end method
