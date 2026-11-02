.class public interface abstract Ld61;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# static fields
.field public static final l:Lra;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lra;

    .line 2
    .line 3
    const/16 v1, 0x11

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, Lra;-><init>(BZ)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Ld61;->l:Lra;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public abstract i(Lu23;Ljava/util/List;)V
.end method

.method public abstract t(Lu23;)Ljava/util/List;
.end method
